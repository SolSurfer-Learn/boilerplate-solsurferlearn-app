package com.example.surfin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MetaTedsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meta_teds)

        supportActionBar?.hide()
    }
}