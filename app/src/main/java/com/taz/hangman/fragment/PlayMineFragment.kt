package com.taz.hangman.fragment

import android.content.Intent
import android.os.CountDownTimer
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.taz.hangman.R
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.base.CountTimer
import com.taz.hangman.dialogfragment.ScoreListDialogFragment
import com.taz.hangman.dialogfragment.WordListDialogFragment
import com.taz.hangman.local.DataHolder
import com.taz.hangman.local.DataHolder.name
import com.taz.hangman.local.DataHolder.word
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.utils.SoundPlayer
import kotlinx.android.synthetic.main.fragment_play_mine.*
import kotlinx.android.synthetic.main.fragment_play_mine.view.*
import timber.log.Timber
import java.lang.Math.max


class PlayMineFragment : BaseFragment(R.layout.fragment_play_mine) {

    private lateinit var countTimer: CountDownTimer
    private var hintCount = 0
    private var isChoiceOver = false
    var correctAnsCount = 0
    var wrongAnsCount = 0

    override fun initView() {
        hintCountText.text = getString(R.string.hint_count_text, hintCount)
        hintInput hasClearErrorOnInputOn hintInputText
        WordListDialogFragment().apply {
            setTargetFragment(
                this@PlayMineFragment,
                Constants.WORD_REQUEST
            )
        }.show(parentFragmentManager, WordListDialogFragment.TAG)
        SoundPlayer.getInstance().apply {playSound(startSound)}

    }
    override fun setupListeners() {
        HangmanDatabase.triggerPath.addSnapshotListener{v,e->
            e?.let { return@addSnapshotListener }
            v?:return@addSnapshotListener
            val word = v.data?.get(Constants.WORD).toString()
            if(word =="" && isChoiceOver) {
                if(this::countTimer.isInitialized) countTimer.cancel()
                gameOver()
                isChoiceOver = false
            }
        }.let { compositeListener.add(it) }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constants.WORD_REQUEST) {
            val word = data?.getStringExtra(Constants.WORD_KEY) ?: ""
            onWordReceived(word)
            Timber.d("word $word")
        }
    }

    private fun onWordReceived(word: String) {
        DataHolder.word = word
        isChoiceOver = true
        NetworkHelper.setWord(word)
        wordText.text = word
        "starting game...".let { timerText.text = it }
        NetworkHelper.updatePlayerStatus(DataHolder.word, 1100)

        countTimer = object : CountTimer(60) {
            override fun onCount(seconds: Int) {
                timerText.text = getString(R.string.game_ends_in, seconds)
            }

            override fun onFinish() {
                gameOver()
            }
        }.start().also { compositeTimer.add(it) }

        hintInput.hintInputText.setOnEditorActionListener({ v, actionId, event ->
            hintInput.error?.let {
                Timber.d("error $it")
                if (it.trim().equals("")) hintUpdate()
            } ?: hintUpdate()
            true
        })

    }

    fun limitScore(score:Int) = if(score<0) 0 else if(score>1000) 1000 else score

    private fun gameOver() {
        "Game Ended".let { timerText.text = it }
        val score = limitScore(hintCount*100 + correctAnsCount*100 - wrongAnsCount*50)
        Timber.d("game Over score $score")
        NetworkHelper.scoreIncrementer(score)
        SoundPlayer.getInstance().apply {playSound(timeUpSound)}

        val scoreListDialogFragment =       ScoreListDialogFragment()
        scoreListDialogFragment.show(
            parentFragmentManager,
            ScoreListDialogFragment.TAG
        )
        object : CountTimer(8) {
            override fun onCount(seconds: Int) {
            }

            override fun onFinish() {
                scoreListDialogFragment.dismissAllowingStateLoss()
                DataHolder.word = Constants.UNINITIALISED
                findNavController().navigate(R.id.action_playMineFragment_to_waitRoomFragment)
            }
        }.start().also { compositeTimer.add(it) }
    }


    private fun hintUpdate() {
        if (hintCount == 3) {
            hintInput.error = "Limit Reached"; return; }
        val hint = hintInput.hintInputText.text.toString().trim()
        if (hint.equals("")) {
            hintInput.error = "Invalid Input"; return
        }
        hintCount++
        hintCountText.text = getString(R.string.hint_count_text, hintCount)
        NetworkHelper.setHint(hint)
        "o $hint".let { view?.findViewById<TextView>(resourceId("hintText$hintCount"))?.text = it }
        hintInput.hintInputText.setText("")
        hideKeyboard()
    }

    fun status(list: List<*>) = "${if (list.size == 1) "${list[0]} has"
    else if (list.size == 2) "${list[0]} and ${list[1]} have"
    else "${list[0]} , ${list[1]} and ${list.size - 2} others have"} got it right"

}
