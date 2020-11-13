package com.mursyidul.tugas2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.core.util.rangeTo
import java.text.NumberFormat

class KalkulatorBmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_bmi)
        val btnhasil = this.findViewById<Button>(R.id.btnkalkulasi)
        val tinggi = this.findViewById<TextView>(R.id.evTinggi)
        val berat = this.findViewById<TextView>(R.id.evBerat)
        val jk = this.findViewById<Spinner>(R.id.spjk)
        var postortubuh = this.findViewById<TextView>(R.id.posturtubuh)

        var hasilnya = this.findViewById<TextView>(R.id.txthasil)

        btnhasil.setOnClickListener {
            if (jk.selectedItem == "Laki-Laki") {
                val t = tinggi.text.toString().toDouble()
                val b = berat.text.toString().toDouble()
                val tingginya = t / 100
                val postur = b.div(tingginya * tingginya)
                var numberFormat = NumberFormat.getNumberInstance()
                numberFormat.maximumFractionDigits = (1)
                val nilai = numberFormat.format(postur)
                hasilnya.setText(nilai.toString())
                when {
                    postur < 17 -> postortubuh.setText("Postur tubuh anda Kurus")
                    postur < 24 -> postortubuh.setText("Postur tubuh anda Normal")
                    postur < 28 -> postortubuh.setText("Postur tubuh anda Kegemukan")
                    postur >= 28 -> postortubuh.setText("Postur tubuh anda Gemuk")
                    else -> postortubuh.setText("angka yang anda masukan tidak valid")
                }
            } else {
                val t = tinggi.text.toString().toDouble()
                val b = berat.text.toString().toDouble()
                val tingginya = t / 100
                val postur = b.div(tingginya * tingginya)
                var numberFormat = NumberFormat.getNumberInstance()
                numberFormat.maximumFractionDigits = (1)
                val nilai = numberFormat.format(postur)
                hasilnya.setText(nilai.toString())
                when {
                    postur < 18 -> postortubuh.setText("Postur tubuh anda Kurus")
                    postur < 26 -> postortubuh.setText("Postur tubuh anda Normal")
                    postur < 28 -> postortubuh.setText("Postur tubuh anda Ideal")
                    postur >= 28 -> postortubuh.setText("Postur tubuh anda Gemuk")
                    else -> postortubuh.setText("angka yang anda masukan tidak valid")
                }


            }

        }


    }
}