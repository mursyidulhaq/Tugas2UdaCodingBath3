package com.mursyidul.tugas2

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView
import com.mursyidul.tugas2.adapter.LisviewAdapter
import com.mursyidul.tugas2.model.Mahasiswa
import kotlinx.android.synthetic.main.activity_listview.*
import kotlinx.android.synthetic.main.item_mahasiswa_list.*

class Listview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val listMahasiswa = ArrayList<Mahasiswa>()
        listMahasiswa.add(Mahasiswa("Rivan nulmuki","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Agus Setiawan","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Mandala","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Fahmi imut","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Intan Rema junita","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Akimirais","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Mandri","082389092795","1701091050"))
        listMahasiswa.add(Mahasiswa("Syarianto","082389092795","1701091050"))

//        listview.adapter = LisviewAdapter(listMahasiswa, object :LisviewAdapter.onClick{
//            override fun detail(item: Mahasiswa) {
//                val intent = Intent(applicationContext,DetailRecyclerview::class.java)
//                intent.putExtra("data",item)
//                startActivity(intent)
//            }
//
//        })

       listview.adapter = LisviewAdapter(listMahasiswa)

       listview.setOnItemClickListener { adapterView, view, i, l ->

           Dialog(this).apply {
               requestWindowFeature(Window.FEATURE_NO_TITLE)
               setCancelable(true)
               setContentView(R.layout.item_mahasiswa_list)
//               val nama = view.findViewById<TextView>(R.id.txtnamaa)
//               val nohp = view.findViewById<TextView>(R.id.txtnohp)
//               val nobp = view.findViewById<TextView>(R.id.txtobp)
               val item = listMahasiswa.get(i)

               txtnamaa.text = "nama: ${item.nama}"
               txtnohpp.text= "nohp :${item.nohp}"
               txtobpp .text = "nobp :${item.nobp}"

               btncancel.setOnClickListener {
                   this.dismiss()
               }
           }.show()


       }



        }





    }
