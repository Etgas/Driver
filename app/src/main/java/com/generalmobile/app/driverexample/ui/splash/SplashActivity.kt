package com.generalmobile.app.driverexample.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.generalmobile.app.driverexample.ui.main.MainActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}