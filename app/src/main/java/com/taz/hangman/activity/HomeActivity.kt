package com.taz.hangman.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout
import com.taz.hangman.R
import com.taz.hangman.local.DataHolder
import com.taz.hangman.local.DataHolder.maxUserCount
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.widgets.ProgressDisplay.showProgress
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.view.*
import timber.log.Timber

class HomeActivity : AppCompatActivity() {


    companion object {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
        setUpCreateRoom()
        setUpJoinRoom()
        capacityText.text = maxUserCount.toString()
        capacitySeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                maxUserCount = 2 + (14f * (progress.toFloat() / 100f)).toInt()
                capacityText.text = maxUserCount.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

    }

    private fun initView() {
        userNameInput hasClearErrorOnInputOn userNameInputText
        codeInput hasClearErrorOnInputOn codeInputText

        val data: Uri? = intent?.data
        data?.let {
            codeInputText.setText(it.pathSegments.last())
        }
    }


    private fun setUpCreateRoom() {
        createButton.setOnClickListener {
            val hud = showProgress("Creating Room").apply { show() }
            val uname = userNameInput.userNameInputText.text.toString()
            if (!uname.equals("")) {
                DataHolder.setCode()
                HangmanDatabase.roomPath().document(DataHolder.code.toString()).get()
                    .addOnSuccessListener {
                        if (it.exists()) {
                            Snackbar.make(createButton,"Some Error Occurred",Snackbar.LENGTH_SHORT).show()
                            return@addOnSuccessListener
                        }
                        DataHolder.name = uname
                        NetworkHelper.initRoom().addOnSuccessListener {
                            hud.dismiss()
                            startActivity(Intent(this, MainActivity::class.java))
                        }
                    }

            } else userNameInput.error = Constants.INVALID_INPUT
        }

    }

    private fun setUpJoinRoom() {
        joinedButton.setOnClickListener {
            val uname = userNameInput.userNameInputText.text.toString()
            if (!uname.equals("")) joinRoom(uname)
            else userNameInput.error = Constants.INVALID_INPUT
        }
    }

    private fun joinRoom(uname: String) {
        val code = codeInput.codeInputText.text.toString()
        val hud = showProgress("Joining Room").apply { show() }
        HangmanDatabase.userPath(code).get().addOnSuccessListener {
            if (it == null || it.isEmpty) {
                codeInput.error = Constants.INVALID_INPUT
                hud.dismiss()
                return@addOnSuccessListener
            }
            val users = it.documents.map { it.id }.also { Timber.d("users: ${it}") }
            HangmanDatabase.roomPath().document(code).get().addOnSuccessListener {
                val maxUserCount = (it?.data?.get(Constants.MAX_USER_COUNT) as Long).toInt()
                    .also { Timber.d("maxUserCount: ${it}") }
//                val turn = it.data?.get(Constants.TURN).toString().also { Timber.d("turn: ${it}") }
                if (uname in users) userNameInput.error = Constants.USER_EXISTS
                else if (users.size == maxUserCount) codeInput.error = Constants.ROOM_FULL
//                else if (turn != "") codeInput.error = Constants.IN_PROGRESS
                else {
                    DataHolder.code = code.toInt()
                    DataHolder.name = uname
                    NetworkHelper.setUser()
                    startActivity(Intent(this, MainActivity::class.java))
                }
                hud.dismiss()
            }

        }
    }

    override fun onStart() {
        super.onStart()
        DataHolder.reset()
    }

    infix fun TextInputLayout.hasClearErrorOnInputOn(appCompatEditText: AppCompatEditText) {
        appCompatEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                this@hasClearErrorOnInputOn.error = ""
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }


}
