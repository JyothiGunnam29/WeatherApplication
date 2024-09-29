package com.example.weatherapplication.ui

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class FusedLocationClass {
    private val fusedLocationClient: FusedLocationProviderClient
    var current_lat: Double = 0.0
    var current_lon: Double = 0.0
    var context: Context? = WeatherApplicationClass.context
    private var listener: ThreadFinishListener? = null

    init {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context!!)
    }


    fun init(listener: ThreadFinishListener?) {
        this.listener = listener
        obtainLocation()
    }

    interface ThreadFinishListener {
        fun onFinish()
    }

    @SuppressLint("MissingPermission")
    private fun obtainLocation() {
        // get the last location
        fusedLocationClient.lastLocation.addOnSuccessListener { location: Location? ->
            if (location != null) {
                current_lat = location.latitude
                current_lon = location.longitude
                listener!!.onFinish()
            }
        }

        fusedLocationClient.lastLocation.addOnFailureListener { e: Exception? -> }
    }

    fun getcurrentlat(): Double {
        return current_lat
    }

    fun getcurrentlong(): Double {
        return current_lon
    }
}
