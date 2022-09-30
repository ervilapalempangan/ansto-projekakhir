package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class activity_signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btnsimpan = findViewById<Button>(R.id.btnsubmit)

        btnsimpan.setOnClickListener {
            Toast.makeText(this, "Data Berhasil di Simpan, Terima Kasih", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@activity_signup,MainActivity::class.java)
            startActivity(intent)
        }
    }

}