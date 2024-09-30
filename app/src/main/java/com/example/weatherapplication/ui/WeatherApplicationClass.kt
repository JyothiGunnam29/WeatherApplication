package com.example.weatherapplication.ui

import android.app.Application
import android.content.Context

class WeatherApplicationClass : Application() {
    var fusedLocation: FusedLocationClass? = null
    override fun onCreate() {
        super.onCreate()

        instance = this
        fusedLocation = FusedLocationClass()
    }

    override fun getApplicationContext(): Context {
        return context!!
    }

    companion object {
        var context: Context? = null
        var instance: WeatherApplicationClass? = null
    }

    init {
        context = this
    }
}
