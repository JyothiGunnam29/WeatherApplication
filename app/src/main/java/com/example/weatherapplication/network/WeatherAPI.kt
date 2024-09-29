package com.example.weatherapplication.network

import com.example.weatherapplication.data.ForecastResult
import com.example.weatherapplication.data.WeatherResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    // get weather data from lat long
    @GET("weather?APPID=a948e79120186178823a287ac6633603")
    fun getWeatherCurrent(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double
    ): Call<WeatherResult?>?

    // get weather data based on searched city name
    @GET("weather?APPID=a948e79120186178823a287ac6633603&units=metric")
    fun getWeatherData(@Query("q") location: String?): Call<WeatherResult?>?

    // get forecast data
    @GET("forecast?APPID=a948e79120186178823a287ac6633603&units=metric")
    fun getForecastCurrent(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double
    ): Call<ForecastResult?>?

    @GET("forecast?APPID=a948e79120186178823a287ac6633603&units=metric")
    fun getForecastData(@Query("q") location: String?): Call<ForecastResult?>?
}
