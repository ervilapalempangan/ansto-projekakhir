package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMasuk = findViewById<Button>(R.id.btnsignin)
        val btnDaftar = findViewById<Button>(R.id.btnsignup)

        btnMasuk.setOnClickListener {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,activity_menu::class.java)
            startActivity(intent)
        }
        btnDaftar.setOnClickListener {
            val intent = Intent(this@MainActivity,activity_signup::class.java)
            startActivity(intent)
        }
    }






}