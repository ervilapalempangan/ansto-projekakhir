package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val kopi = findViewById<Button>(R.id.btnkopi)
        val boba = findViewById<Button>(R.id.btnboba)

        kopi.setOnClickListener {
            val intent = Intent(this@activity_menu,activity_kopi::class.java)
            startActivity(intent)
        }
    }

}