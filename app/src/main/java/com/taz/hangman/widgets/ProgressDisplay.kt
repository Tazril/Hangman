package com.taz.hangman.widgets

import android.content.Context
import androidx.core.content.ContextCompat
import com.kaopiz.kprogresshud.KProgressHUD
import com.taz.hangman.R

object ProgressDisplay {
    fun Context.showProgress( label : String): KProgressHUD {
        return  KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setLabel(label)
            .setBackgroundColor(ContextCompat.getColor(this, R.color.app_violet))
            .setCancellable(false)
            .setCornerRadius(15f)
            .setAnimationSpeed(2)
            .setDimAmount(0.5f)
    }
}