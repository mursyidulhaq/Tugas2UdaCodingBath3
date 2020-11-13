package com.mursyidul.tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mursyidul.tugas2.adapter.RecyclerViewAdapter
import com.mursyidul.tugas2.model.Mahasiswa
import kotlinx.android.synthetic.main.item_mahasiswa.*


class Recyclerview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val recyclerview  : RecyclerView = findViewById(R.id.list_recycler)

        var listMahasiswa = ArrayList<Mahasiswa>()
        listMahasiswa.add(Mahasiswa("Rivan nulmuki","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Agus Setiawan","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Mandala","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Fahmi imut","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Intan Rema junita","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Akimirais","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Mandri","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Syarianto","082389092795","1701091050"))

        recyclerview.adapter = RecyclerViewAdapter(listMahasiswa,object : RecyclerViewAdapter.onClikck{
            override fun detail(item: Mahasiswa) {
                val intent = Intent(applicationContext,DetailRecyclerview::class.java)

                intent.putExtra("data",item)
                startActivity(intent)
            }

        })












    }
}