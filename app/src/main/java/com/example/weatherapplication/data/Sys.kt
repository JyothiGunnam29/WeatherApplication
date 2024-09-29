package com.example.weatherapplication.data

import com.google.gson.annotations.SerializedName

class Sys {
    @SerializedName("type")
    var type: Int = 0

    //@SerializedName("id")
    var id: Long = 0

    @SerializedName("country")
    var country: String? = null

    @SerializedName("sunrise")
    var sunrise: Long = 0

    @SerializedName("sunset")
    var sunset: Long = 0
}
