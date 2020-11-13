package com.mursyidul.tugas2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.mursyidul.tugas2.Listview
import com.mursyidul.tugas2.R
import com.mursyidul.tugas2.model.Mahasiswa

class LisviewAdapter(val data : ArrayList<Mahasiswa>) :BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view :View = LayoutInflater.from(p2?.context).inflate(R.layout.item_mahasiswa,p2,false)
        val nama = view.findViewById<TextView>(R.id.txtnama)
        val nohp = view.findViewById<TextView>(R.id.txtnohp)
        val nobp = view.findViewById<TextView>(R.id.txtobp)
        val item = data.get(p0)

        nama.text = item?.nama
        nohp.text = item?.nohp
        nobp.text = item?.nobp
        return  view
    }

    override fun getItem(p0: Int): Any {
        return data.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int = data.size


}