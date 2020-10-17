package com.taz.hangman.fragment

import android.os.CountDownTimer
import androidx.navigation.fragment.findNavController
import com.kaopiz.kprogresshud.KProgressHUD
import com.taz.hangman.R
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.base.CountTimer
import com.taz.hangman.local.DataHolder
import com.taz.hangman.local.QuoteSource
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.widgets.ProgressDisplay.showProgress
import kotlinx.android.synthetic.main.fragment_wait_room.*
import timber.log.Timber

class WaitRoomFragment : BaseFragment(R.layout.fragment_wait_room) {


    override fun initView() {
        val quote = QuoteSource.randomQuote()
        quoteText.text = quote.text
        authorText.text = quote.author
        statusText.text = "Waiting for turn"
    }

    private lateinit var countTimer: CountDownTimer
    private lateinit var hud: KProgressHUD
    override fun setupListeners() {
        HangmanDatabase.triggerPath.addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            it ?: return@addSnapshotListener
            val turn =
                it.data?.get(Constants.TURN)?.toString().also { Timber.d("turn $it") }
            turn?.let {
                Timber.d("turn  $it DataHolder.turn  ${DataHolder.turn }")
                if (it!="" && DataHolder.turn != it) {
                    onTurnReceived(it)
                    return@addSnapshotListener
                }
            }
            val word = it.data?.get(Constants.WORD).toString()
            if (word == "") return@addSnapshotListener
            DataHolder.word = word.also { Timber.d("Word Generated: $it") }
            if(findNavController().currentDestination?.id==R.id.waitRoomFragment)
            findNavController().navigate(R.id.action_waitRoomFragment_to_playOtherFragment)
        }.let { compositeListener.add(it) }


    }

    private fun onTurnReceived(turn: String) {
        DataHolder.turn = turn
        Timber.d("onTurnReceived $turn DataHolder.turn  ${DataHolder.turn }")
        if (turn == Constants.EXHAUSTED)
            findNavController().navigate(R.id.action_waitRoomFragment_to_resultFragment)
        else if (turn == DataHolder.name) findNavController().navigate(R.id.action_waitRoomFragment_to_playMineFragment)
        else {
            if(this::countTimer.isInitialized)  countTimer.cancel()
            countTimer = object : CountTimer(10) {
                override fun onCount(seconds: Int) {
                    timerText.text = getString(R.string.choice_ends_in, seconds)
                }

                override fun onFinish() {
                    "Choice Ended".let { timerText.text = it }
                }
            }.start().also { compositeTimer.add(it) }
            statusText.text = getString(R.string.choosing_a_word, DataHolder.turn)
        }
    }


}
