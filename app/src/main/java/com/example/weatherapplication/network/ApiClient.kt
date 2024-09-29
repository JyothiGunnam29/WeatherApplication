package com.example.weatherapplication.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private var retrofit: Retrofit? = null

    @JvmStatic
    val client: Retrofit?
        get() {
            if (retrofit == null) {
                val logging = HttpLoggingInterceptor()
                logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                val httpClient: OkHttpClient =
                    OkHttpClient.Builder().addInterceptor(logging).build()

                retrofit = Retrofit.Builder()
                    .client(httpClient) //Retrofit.Builder class uses the Builder API to allow defining the URL end point for the HTTP operations and finally build a new Retrofit instance.
                    //http://api.openweathermap.org/data/2.5/weather?q=London&APPID=76a35a17f3e1bce771a09f3555b614a8
                    .baseUrl("https://api.openweathermap.org/data/2.5/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}
