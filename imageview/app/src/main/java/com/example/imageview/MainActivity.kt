package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.editusername)
        var password = findViewById<EditText>(R.id.editpassword)
        var submit = findViewById<Button>(R.id.btnsubmit)

        submit.setOnClickListener{
            val isiusername = username.text.toString()
            val isipassword = password.text.toString()

            if (isiusername == "ervila" && isipassword == "1234") {
                //jika login berhasil
                Toast.makeText(
                    applicationContext, "LOGIN SUKSES",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this,formpendaftaran::class.java)
                        startActivity(intent)
                finish()

            } else {
                //jika login gagal
                Toast.makeText(this, "Username atau Password Anda Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}