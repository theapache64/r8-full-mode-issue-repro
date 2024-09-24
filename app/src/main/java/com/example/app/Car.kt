package com.example.app


import com.google.gson.annotations.SerializedName

data class Car(
    @SerializedName("color")
    val color: String, // Blue
    @SerializedName("make")
    val make: String, // Toyota
    @SerializedName("model")
    val model: String, // Corolla
    @SerializedName("year")
    val year: Int, // 2022
)