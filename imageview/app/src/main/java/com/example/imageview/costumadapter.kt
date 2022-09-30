package com.example.imageview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class costumadapter (val context: Context, val produks: List<produk>): BaseAdapter(){
    override fun getCount(): Int {
        return produks.size
    }

    override fun getItem(p0: Int): Any {
        return produks.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = p1?: LayoutInflater.from(context).inflate(R.layout.daftar,p2,false)
        val p = view.findViewById<ImageView>(R.id.gambar1)
        val d = view.findViewById<TextView>(R.id.teksg)
        val x = produks.get(p0)
        p.setImageResource(x.poster)
        d.text = x.drama
        return view
    }

}