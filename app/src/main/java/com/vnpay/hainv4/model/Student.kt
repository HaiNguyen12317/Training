package com.vnpay.hainv4.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

@Entity(tableName = "student")
data class Student(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id : Int,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("phone")
    val age: Int,
    @SerializedName("gender")
    val className: String = "",
    @SerializedName("address")
    val address: String = ""
)
