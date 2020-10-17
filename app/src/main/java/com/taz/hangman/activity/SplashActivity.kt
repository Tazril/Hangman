package com.taz.hangman.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.taz.hangman.R
import com.taz.hangman.utils.ClearOnSwipeService

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar?.hide()
        startService( Intent(baseContext, ClearOnSwipeService::class.java))
        Handler().postDelayed({
            startActivity(
                Intent(
                    this@SplashActivity,
                    HomeActivity::class.java
                )
            )
            finish()
        }, 2000)
    }
}
