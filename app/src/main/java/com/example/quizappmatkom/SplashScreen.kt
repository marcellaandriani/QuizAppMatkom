package com.example.quizappmatkom

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        sharedPreferences = applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            },
            2000
        )
    }
}


