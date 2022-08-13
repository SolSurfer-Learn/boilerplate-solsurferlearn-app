package com.example.surfin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GamingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gaming)

        supportActionBar?.hide()

    }
}
