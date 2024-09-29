package com.example.weatherapplication.data

import com.google.gson.annotations.SerializedName

class Wind {
    @JvmField
    @SerializedName("speed")
    var speed: Double = 0.0

    @SerializedName("deg")
    var deg: Long = 0

    @SerializedName("gust")
    var gust: Double = 0.0
}
