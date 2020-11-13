package com.mursyidul.tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginSederhana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sederhana)




    }

    fun login(view: View) {
        var user = this.findViewById<EditText>(R.id.tvussername)
        var pass = this.findViewById<EditText>(R.id.tvpassword)
        view.setOnClickListener {
            if (user.text.toString().isEmpty())
            {
                user.error = "username harus di inputkan"
            }else if (pass.text.toString().isEmpty())
            {
                pass.error = " password harus di inputkan"
            }else if (user.text.toString() != "admin")
            {
                Toast.makeText(this,"username salah",Toast.LENGTH_SHORT).show()
            }
            else if (pass.text.toString() != "admin")
            {
                Toast.makeText(this,"password salah",Toast.LENGTH_SHORT).show()
            }else if(user.text.toString() == "admin" && pass.text.toString() == "admin")
            {
                val intent = Intent(applicationContext,Detail::class.java)
                startActivity(intent)
            }
        }
    }
}