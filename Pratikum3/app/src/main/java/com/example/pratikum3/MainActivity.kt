package com.example.pratikum3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.img1)
        val image2 = findViewById<ImageView>(R.id.img2)
        val image3 = findViewById<ImageView>(R.id.img3)
        val image4 = findViewById<ImageView>(R.id.img4)
        val image5 = findViewById<ImageView>(R.id.img5)
        val image6 = findViewById<ImageView>(R.id.img6)
        val image7 = findViewById<ImageView>(R.id.img7)
        val image8 = findViewById<ImageView>(R.id.img8)
        val image9 = findViewById<ImageView>(R.id.img9)
        val image10 = findViewById<ImageView>(R.id.img10)
        val image11 = findViewById<ImageView>(R.id.img11)
        val imageview = findViewById<ImageView>(R.id.image)

        image1.setOnClickListener{
            imageview.setImageResource(R.drawable.icon1)
        }
        image2.setOnClickListener{
            imageview.setImageResource(R.drawable.icon2)
        }
        image3.setOnClickListener{
            imageview.setImageResource(R.drawable.icon3)
        }
        image4.setOnClickListener{
            imageview.setImageResource(R.drawable.icon4)
        }
        image5.setOnClickListener{
            imageview.setImageResource(R.drawable.icon5)
        }
        image6.setOnClickListener{
            imageview.setImageResource(R.drawable.icon6)
        }
        image7.setOnClickListener{
            imageview.setImageResource(R.drawable.icon7)
        }
        image8.setOnClickListener{
            imageview.setImageResource(R.drawable.icon8)
        }
        image9.setOnClickListener{
            imageview.setImageResource(R.drawable.icon9)
        }
        image10.setOnClickListener{
            imageview.setImageResource(R.drawable.icon10)
        }
        image11.setOnClickListener{
            imageview.setImageResource(R.drawable.icon11)
        }
    }
}