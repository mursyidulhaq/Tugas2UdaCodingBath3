package com.mursyidul.tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    fun logout(view: View)
    {
        view.setOnClickListener {
            val intent = Intent(applicationContext,LoginSederhana::class.java)
            startActivity(intent)
        }

    }
}