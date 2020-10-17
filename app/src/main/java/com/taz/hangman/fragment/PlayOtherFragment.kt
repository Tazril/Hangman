package com.taz.hangman.fragment

import android.os.CountDownTimer
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.taz.hangman.GameLogic
import com.taz.hangman.R
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.base.CountTimer
import com.taz.hangman.dialogfragment.ScoreListDialogFragment
import com.taz.hangman.local.DataHolder
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.utils.SoundPlayer
import kotlinx.android.synthetic.main.fragment_play_other.*
import timber.log.Timber


class PlayOtherFragment : BaseFragment(R.layout.fragment_play_other) {


    lateinit var gameLogic: GameLogic
    private var isGameFinished = false
    var timeLeft = 0
    var isGameOver = false
    var score = 0
    var text = ""
    private lateinit var countTimer: CountDownTimer

    override fun initView() {
        gameLogic = GameLogic(
            DataHolder.word,
            wordDisplayLayout,
            hangmanDisplayText
        )
        initializeGame()
        SoundPlayer.getInstance().apply { playSound(startSound) }

    }

    private fun initializeGame() {

        countTimer = object : CountTimer(60) {
            override fun onCount(seconds: Int) {
                timeLeft = seconds
                if (isGameOver) "$text Score: $score Time Left: $timeLeft s".let {
                    timerText.text = it
                }
                else timerText.text =
                    getString(R.string.guess_the_word_in_00_00, timeLeft)
            }

            override fun onFinish() {
                if(!isGameFinished) gameOver()
            }
        }.start().also { compositeTimer.add(it) }

        alphaKeyboard.onLetterPressed = { letter ->
            SoundPlayer.getInstance().apply { playSound(keypressSound) }
            when (gameLogic.event(letter)) {
                GameLogic.STATUS.WON -> {
                    alphaKeyboard.disableAll()
                    score = limitScore(gameLogic.score(timeLeft.toFloat()) + 100)
                    NetworkHelper.updatePlayerStatus(gameLogic.getWordDisplay(), score)
                    text = "You Won"
                    SoundPlayer.getInstance().apply { playSound(successSound) }
                    isGameOver = true
                }
                GameLogic.STATUS.LOST -> {
                    alphaKeyboard.disableAll()
                    score = limitScore(gameLogic.score(timeLeft.toFloat()) - 50)
                    NetworkHelper.updatePlayerStatus(gameLogic.getWordDisplay(), score)
                    SoundPlayer.getInstance().apply { playSound(failureSound) }
                    text = "You Lost"
                    isGameOver = true
                }
                else -> {
                    NetworkHelper.updatePlayerStatus(gameLogic.getWordDisplay(), -1)
                    Timber.d("Game In Progress... chosen letter $letter")
                }
            }
        }
    }

    private fun gameOver() {
        alphaKeyboard.disableAll()
        if (!isGameOver) {
            score = gameLogic.score(1f)
            NetworkHelper.updatePlayerStatus(gameLogic.getWordDisplay(), score)
            isGameOver = true
        }
        Timber.d("game Over score $score")
        "Game Over Score: $score".let { timerText.text = it }
        SoundPlayer.getInstance().apply { playSound(timeUpSound) }
        NetworkHelper.scoreIncrementer(score)

        val scoreListDialogFragment = ScoreListDialogFragment()
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
                findNavController().navigate(R.id.action_playOtherFragment_to_waitRoomFragment)
            }
        }.start().let { compositeTimer.add(it) }
    }

    override fun setupListeners() {
        HangmanDatabase.hintsPath.addSnapshotListener { snapshots, error ->
            error?.let { return@addSnapshotListener }
            snapshots?.let {
                val hintList= (it.data?.get("value")?: emptyList<String>())  as List<*>
                hintUpdate(hintList)
            }
        }.let { compositeListener.add(it) }

        HangmanDatabase.triggerPath.addSnapshotListener { v, e ->
            e?.let { return@addSnapshotListener }
            v ?: return@addSnapshotListener
            val word = v.data?.get(Constants.WORD).toString()
            if (word == "" && !isGameFinished) {
                isGameFinished = true
                if (this::countTimer.isInitialized) countTimer.cancel()
                gameOver()
            }
        }.let { compositeListener.add(it) }
    }


    private fun limitScore(score: Int) = if (score < 0) 0 else if (score > 1000) 1000 else score

    private fun hintUpdate(hintList: List<*>) {
        for (i in 0..2) {
            "o ${if(i<hintList.size) hintList[i] else "missing..."}".let {
                view?.findViewById<TextView>(
                    resourceId("hintText${i+1}")
                )?.text = it
            }
        }
    }

}
