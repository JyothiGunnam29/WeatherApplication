package com.example.weatherapplication.data

import com.google.gson.annotations.SerializedName

class WeatherResult {
    @SerializedName("sys")
    var sys: Sys? = null

    @SerializedName("timezone")
    var timezone: Long = 0

    @SerializedName("id")
    var id: Long = 0

    @JvmField
    @SerializedName("name")
    var name: String? = null

    @JvmField
    @SerializedName("cod")
    var cod: Int = 0

    @JvmField
    @SerializedName("wind")
    var wind: Wind? = null

    @JvmField
    @SerializedName("dt")
    var dt: Long = 0

    @SerializedName("clouds")
    var clouds: Clouds? = null

    @SerializedName("visibility")
    var visibility: Long = 0

    @SerializedName("base")
    var base: String? = null

    @SerializedName("coord")
    var coord: Coord? = null

    @JvmField
    @SerializedName("main")
    var main: Main? = null

    @JvmField
    @SerializedName("weather")
    var weatherList: List<Weather>? = null
}
