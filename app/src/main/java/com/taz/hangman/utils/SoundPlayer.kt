package com.taz.hangman.utils

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool
import com.taz.hangman.R
import com.taz.hangman.local.DataHolder

class SoundPlayer(context: Context) {

    companion object {
        private const val TAG = "SoundPlayer"

        private var _instance: SoundPlayer? = null
        fun createInstance(context: Context) {
            if (_instance == null) {
                _instance = SoundPlayer(context)
            }
        }

        fun getInstance() = _instance!!
    }


    private var soundPool : SoundPool
    val startSound : Int
    val endSound : Int
    val successSound: Int
    val failureSound : Int
    val timeUpSound : Int
    val keypressSound : Int


    init {
        val audioAttributes =
            AudioAttributes.Builder().setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build()
        soundPool = SoundPool.Builder().setMaxStreams(3).setAudioAttributes(audioAttributes).build()
        startSound = soundPool.load(context, R.raw.game_start,1)
        endSound = soundPool.load(context, R.raw.game_over,1)
        successSound = soundPool.load(context, R.raw.success,1)
        failureSound = soundPool.load(context, R.raw.failure,1)
        timeUpSound = soundPool.load(context, R.raw.time_up,1)
        keypressSound = soundPool.load(context, R.raw.keypress,1)
    }


    fun playSound(sound:Int) {
        if(!DataHolder.isSilent)
        soundPool.play(sound,1f,1f,0,0,1f)
    }
}