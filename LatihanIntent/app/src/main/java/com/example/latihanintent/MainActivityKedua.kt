package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivityKedua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kedua)

        var intent = intent
        val namaDepan = intent.getStringExtra("Nama Depan")
        val namaBelakang = intent.getStringExtra("Nama Belakang")

        val result = findViewById<TextView>(R.id.welcome)

        result.text = "Selamat Pendaftaran " +namaDepan+ " "+namaBelakang+" Berhasil"
    }
}