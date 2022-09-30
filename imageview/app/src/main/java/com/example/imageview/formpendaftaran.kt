package com.example.imageview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class formpendaftaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formpendaftaran)

        var simpan = findViewById<Button>(R.id.btnsimpan)

        simpan.setOnClickListener {
            Toast.makeText(this, "Data Berhasil di Simpan, Terima Kasih", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,formimage::class.java)
            startActivity(intent)
            finish()
        }
    }
}