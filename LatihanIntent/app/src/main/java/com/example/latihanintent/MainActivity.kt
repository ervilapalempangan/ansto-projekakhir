package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaDepan = findViewById<EditText>(R.id.nama1)
        val namaBelakang = findViewById<EditText>(R.id.nama2)
        val daftarBtn = findViewById<Button>(R.id.button1)

        daftarBtn.setOnClickListener {
            val nmDepan = namaDepan.text.toString()
            val nmBelakang = namaBelakang.text.toString()

            val intent = Intent(this@MainActivity,MainActivityKedua::class.java)
            intent.putExtra("Nama Depan", nmDepan)
            intent.putExtra("Nama Belakang", nmBelakang)
            startActivity(intent)
        }
    }
}