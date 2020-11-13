package com.mursyidul.tugas2.model

import android.os.Parcelable
import androidx.annotation.VisibleForTesting
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mahasiswa(
        var nama :String = "",
        var nohp :String = "",
        var nobp :String = ""
):Parcelable