package com.example.quizappmatkom

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nameTextView: TextView = findViewById(R.id.tv_name)
        val totalScoreTextView: TextView = findViewById(R.id.tv_totalScore)
        val btnFinish: TextView = findViewById(R.id.btnFinish)

        val username = intent.getStringExtra("user") ?: "John"
        val correctAnswers = intent.getIntExtra("correct", 0)

        nameTextView.text = username
        totalScoreTextView.text = "You scored $correctAnswers out of 10"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}
