package com.example.weatherapplication.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ForecastDao {
    @Insert
    suspend fun insert(forecast: ForecastEntity)

    @Query("SELECT * FROM forecast WHERE cityName = :city AND date = :date LIMIT 1")
    suspend fun getForecastByCityAndDate(city: String, date: String): ForecastEntity?

    @Query("SELECT COUNT(*) FROM forecast WHERE cityName = :city AND date = :date")
    suspend fun countForecastsByCityAndDate(city: String, date: String): Int
}