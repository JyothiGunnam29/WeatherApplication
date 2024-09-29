package com.example.weatherapplication.data

import com.google.gson.annotations.SerializedName

class Weather {
    @JvmField
    @SerializedName("main")
    var main: String? = null

    //@SerializedName("id")
    var id: Int = 0

    @JvmField
    @SerializedName("icon")
    var icon: String? = null

    @JvmField
    @SerializedName("description")
    var description: String? = null
}
