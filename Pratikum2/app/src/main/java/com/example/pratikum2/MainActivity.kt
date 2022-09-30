package com.example.pratikum2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val provinsiArray = arrayOf("Aceh","Sumatera Utara","Riau","Sumatera Barat","Jambi",
                                    "Sumatera Selatan","Kepulauan Bangka Belitung","Bengkulu",
                                    "Lampung","DKI Jakarta","Banten","Jawa Barat","Jawa Tengah",
                                    "DI Yogyakarta","Jawa Timur","Bali","Nusa Tenggara Barat",
                                    "Nusa Tenggara Timur","Kalimantan Barat","Kalimantan Tengah",
                                    "Kalimantan Selatan","Kalimantan Timur","Kalimantan Utara",
                                    "Sulawesi Utara","Gorontalo","Sulawesi Tengah","Sulawesi Barat",
                                    "Sulawesi Selatan","Sulawesi Tenggara","Maluku","Maluku Utara",
                                    "Papua Barat","Papua")

        val listView = findViewById<ListView>(R.id.provinsi_list)

        listView.adapter =ArrayAdapter(this,R.layout.listview,provinsiArray)

        listView.setOnItemClickListener{parent, view, position,id ->
            Toast.makeText(this,"Anda memilih: ${provinsiArray[position]}",Toast.LENGTH_SHORT).show()
        }
    }
}