package com.example.surfin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Shop1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop1)

        supportActionBar?.hide()
    }
}