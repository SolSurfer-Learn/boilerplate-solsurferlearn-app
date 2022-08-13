package com.example.surfin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        val imageButton: ImageButton =findViewById(R.id.imageButton25)
        imageButton.setOnClickListener {
            startActivity(Intent(this, GamingActivity::class.java))
        }
        val imageButton1: ImageButton =findViewById(R.id.imageButton)
        imageButton1.setOnClickListener {
            startActivity(Intent(this, Shop1Activity::class.java))
        }
        val imageButton2: ImageButton =findViewById(R.id.imageButton9)
        imageButton2.setOnClickListener {
            startActivity(Intent(this, MetaTedsActivity::class.java))
        }
        val imageButton3: ImageButton =findViewById(R.id.imageButton19)
        imageButton3.setOnClickListener {
            startActivity(Intent(this, SolSurferActivity::class.java))
        }
        val imageButton4: ImageButton =findViewById(R.id.imageButton17)
        imageButton4.setOnClickListener {
            startActivity(Intent(this, LearnActivity::class.java))
        }



    }
}
