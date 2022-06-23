package com.vnpay.hainv4.model

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize


data class Item(
    var title : String = "",
    var hotel : List<Hotel>,

)
@Parcelize
data class Hotel(
    val name: String = "",
    val address: String = "",
    val image: String = "",
    val price: Int = 0,
) : Parcelable
