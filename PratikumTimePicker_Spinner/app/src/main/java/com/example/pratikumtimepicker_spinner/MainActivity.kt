package com.example.pratikumtimepicker_spinner

import android.content.DialogInterface
//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.support.v7.app.AlertDialog
//import androidx.appcompat.app.AlertDialog
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var timePicker: timePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonTime = findViewById<Button>(R.id.button1)
        timePicker = timePicker(this,false,true)
        buttonTime.setOnClickListener{
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){
        val cal = Calendar.getInstance()
        val h = cal.get(Calendar.HOUR_OF_DAY)
        val m = cal.get(Calendar.MINUTE)
        timePicker.showDialog(h, m, object : timePicker.Callback{
            override fun onTimeSelected(hourOfDay: Int, minute: Int){
                val hourStr = if (hourOfDay < 10) "0${hourOfDay}" else "${hourOfDay}"
                val minuteStr = if (minute < 10) "0${minute}" else "${minute}"
                val textTime = findViewById<TextView>(R.id.textView1)
                textTime.text= "${hourOfDay}:${minuteStr}"
            }
        })
    }
}