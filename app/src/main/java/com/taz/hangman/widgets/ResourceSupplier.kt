package com.taz.hangman.widgets

import android.content.Context
import androidx.core.content.ContextCompat
import com.taz.hangman.utils.SoundPlayer

class ResourceSupplier(val context: Context) {
    companion object {

        private var _instance: ResourceSupplier? = null
        fun createInstance(context: Context) {
            if (_instance == null) {
                _instance = ResourceSupplier(context)
            }
        }
        fun getInstance() = _instance!!

    }
    fun getColor(rid:Int) = ContextCompat.getColor(context,rid)
    fun getDrawable(rid:Int) = ContextCompat.getDrawable(context,rid)

}