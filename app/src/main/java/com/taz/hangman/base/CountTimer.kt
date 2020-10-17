package com.taz.hangman.base

import android.os.CountDownTimer

abstract class CountTimer(timeInSeconds: Int) :
    CountDownTimer(timeInSeconds.toLong() * 1000, 1000) {
    override fun onTick(millisUntilFinished: Long) {
        onCount(millisUntilFinished.toInt()/1000)
    }
    abstract fun onCount(seconds: Int)
}