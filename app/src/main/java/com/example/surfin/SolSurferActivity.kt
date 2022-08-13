package com.example.surfin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SolSurferActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sol_surfer)

        supportActionBar?.hide()
    }
}