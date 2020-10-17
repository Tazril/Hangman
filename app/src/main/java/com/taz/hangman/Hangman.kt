package com.taz.hangman

import android.app.Application
import android.media.MediaPlayer
import com.google.firebase.firestore.FirebaseFirestore
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.SoundPlayer
import com.taz.hangman.widgets.ResourceSupplier
import timber.log.Timber

class Hangman : Application() {

    override fun onCreate() {
        super.onCreate()
//        HangmanDatabase.db = FirebaseFirestore.getInstance()
        if(BuildConfig.DEBUG)
        Timber.plant(Timber.DebugTree())
        SoundPlayer.createInstance(this)
        ResourceSupplier.createInstance(this)

    }



}