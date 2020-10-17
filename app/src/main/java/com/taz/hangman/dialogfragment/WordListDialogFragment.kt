package com.taz.hangman.dialogfragment

import android.content.Intent
import android.view.View
import com.taz.hangman.R
import com.taz.hangman.base.BaseDialogFragment
import com.taz.hangman.base.CountTimer
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.Constants.WORD_KEY
import com.taz.hangman.local.WordSource
import com.taz.hangman.utils.SoundPlayer
import kotlinx.android.synthetic.main.fragment_word_list.*


class WordListDialogFragment : BaseDialogFragment(R.layout.fragment_word_list) {

    companion object {
        const val TAG = "WordListDialogFragment"
    }

    private val wordList = WordSource.threeWords()
    private lateinit var optionGroup: OptionGroup


    override fun initView() {
        optionText1.text = wordList[0]
        optionText2.text = wordList[1]
        optionText3.text = wordList[2]
        optionGroup = OptionGroup()

        object : CountTimer(10) {
            override fun onCount(seconds: Int) {
                timerText.text = getString(R.string.chooses_a_word_in_00_30, seconds)
            }

            override fun onFinish() {
                SoundPlayer.getInstance().apply { playSound(timeUpSound) }
                if (optionButton4.isChecked && optionEditText.text.toString().equals(""))
                    optionButton1.isChecked = true
                wordReceived()
            }
        }.start().let { compositeTimer.add(it) }

        submitButton.setOnClickListener { wordReceived() }
    }

    override fun setupListeners() {
    }

    private fun wordReceived() {
        targetFragment?.onActivityResult(
            targetRequestCode,
            Constants.WORD_REQUEST,
            Intent().apply { putExtra(WORD_KEY, optionGroup.getWord()) }
        )
        dismissAllowingStateLoss()
    }

    inner class OptionGroup {
        private val optionsCount = 4
        private val optionsView = listOf(optionButton1, optionButton2, optionButton3, optionButton4)
        private val optionsTextView = listOf(optionText1, optionText2, optionText3, optionEditText)

        init {
            for (id in 0..(optionsCount - 1)) {
                optionsView[id].setOnCheckedChangeListener { buttonView, isChecked ->
                    if (isChecked) check(buttonView)
                }
                optionsTextView[id].setOnClickListener { optionsView[id].isChecked = true }
            }
            optionButton1.isChecked = true
        }

        private fun check(view: View) = optionsView.forEach { if (it != view) it.isChecked = false }

        fun getWord(): String {
            for (id in 0..(optionsCount - 2)) {
                if (optionsView[id].isChecked) {
                    return optionsTextView[id].text.toString()
                }
            }
            return optionEditText.text.toString()
        }
    }
}