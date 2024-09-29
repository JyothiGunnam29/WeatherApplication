package com.example.weatherapplication.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "forecast")
data class ForecastEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val cityName: String,
    val date: String,  // e.g., "2024-09-27"
    val temperature: Double,
    val description: String
)