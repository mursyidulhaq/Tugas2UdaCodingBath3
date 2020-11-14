package com.mursyidul.tugas2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class HitungUmur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_umur)
//
       var tahunlahir  = this.findViewById<EditText>(R.id.tvumuranda)
       var hasil = this.findViewById<Button>(R.id.btnhasil)
        var umur = this.findViewById<TextView>(R.id.txtumursekarang)

       hasil.setOnClickListener {
           var tahunsekarang = Calendar.getInstance().get(Calendar.YEAR)
           var b= tahunsekarang.toString().toInt()
           if (tahunlahir.text.toString().isNotEmpty())
           {

               var tahunsekarang = Calendar.getInstance().get(Calendar.YEAR)
               var b= tahunsekarang.toString().toInt()
               var c = b - tahunlahir.text.toString().toInt()
               if(tahunlahir.text.toString().toInt() >= b)
               {
                   tahunlahir.error = " umur anda kurang dari satu tahun atau anda belum lahir"

               }else
               {
                   umur.setText(c.toString())
               }

           }


           else
           {
               tahunlahir.error = "tahun lahir harus di inputkan"
           }


//
      }




    }
}