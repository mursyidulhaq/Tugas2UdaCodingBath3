package com.mursyidul.tugas2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mursyidul.tugas2.R
import com.mursyidul.tugas2.model.Mahasiswa

class RecyclerViewAdapter(var data: ArrayList<Mahasiswa>, var onClilckListener: onClikck) :RecyclerView.Adapter<RecyclerViewAdapter.RecyclerviewHolder>(){
    class RecyclerviewHolder(view : View):RecyclerView.ViewHolder(view) {

        val nama = view.findViewById<TextView>(R.id.txtnama)
        val nohp = view.findViewById<TextView>(R.id.txtnohp)
        val nobp = view.findViewById<TextView>(R.id.txtobp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerviewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_mahasiswa, parent,false)
        return RecyclerviewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size ?:0
    }

    override fun onBindViewHolder(holder: RecyclerviewHolder, position: Int) {
        val item = data?.get(position)
        holder.nama.text = item.nama
        holder.nohp.text = item.nohp
        holder.nobp.text = item.nobp

        holder.itemView.setOnClickListener {
            onClilckListener.detail(item)
        }
    }

    interface onClikck{
        fun detail(item :Mahasiswa)
    }

}
