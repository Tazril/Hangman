package com.taz.hangman.utils

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.google.android.gms.common.data.DataHolder
import com.taz.hangman.local.DataHolder.code
import com.taz.hangman.local.DataHolder.name
import timber.log.Timber

class ClearOnSwipeService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Timber.d("Service Started")
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d( "Service Destroyed")
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        Timber.e("END")
        if(code!=0 && name!="") {
            NetworkHelper.removeUser().addOnSuccessListener {
                stopSelf()
            }.addOnFailureListener {  stopSelf() }
        } else  stopSelf()
    }
}