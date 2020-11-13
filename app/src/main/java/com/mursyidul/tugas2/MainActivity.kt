 package com.mursyidul.tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun bmi(view: View) {
         view.setOnClickListener {
             val intent = Intent(applicationContext,KalkulatorBmi::class.java)
             startActivity(intent)
         }
     }

     fun hitungumur(view: View) {
         view.setOnClickListener {
             val intent = Intent(applicationContext,HitungUmur::class.java)
             startActivity(intent)
         }
     }
     fun login(view: View) {
         view.setOnClickListener {
             val intent = Intent(applicationContext,LoginSederhana::class.java)
             startActivity(intent)
         }
     }
     fun recyclerview(view: View) {
         view.setOnClickListener {
             val intent = Intent(applicationContext,Recyclerview::class.java)
             startActivity(intent)
         }
     }
     fun listview(view: View) {
         view.setOnClickListener {
             val intent = Intent(applicationContext,Listview::class.java)
             startActivity(intent)
         }

     }


 }