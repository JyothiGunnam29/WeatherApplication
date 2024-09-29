package com.example.weatherapplication.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_table")
class WeatherEntity(
    @JvmField var city: String,
    var temperature: Double,
    var date: String,
    var humidity: Int,
    var description: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

