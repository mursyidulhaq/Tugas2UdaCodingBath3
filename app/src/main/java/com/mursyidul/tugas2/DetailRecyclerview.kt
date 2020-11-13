package com.mursyidul.tugas2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mursyidul.tugas2.model.Mahasiswa
import kotlinx.android.synthetic.main.activity_detail_recyclerview.*

class DetailRecyclerview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recyclerview)

        val detail = intent.getParcelableExtra<Mahasiswa>("data")
        if(detail != null)
        {
            detailnama.setText(detail.nama)
            detailnohp.setText(detail.nohp)
            detailnobp.setText(detail.nobp)
        }

    }
}