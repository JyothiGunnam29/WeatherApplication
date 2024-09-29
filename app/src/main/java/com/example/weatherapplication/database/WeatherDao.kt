package com.example.weatherapplication.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weatherapplication.data.Weather

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(weatherEntity: WeatherEntity)

    @Query("SELECT * FROM weather_table WHERE city = :city AND date = :date LIMIT 1")
    fun getWeatherByCity(city: String?, date: String): WeatherEntity?

    @Query("SELECT * FROM weather_table")
    suspend fun getAllWeather(): List<WeatherEntity>

    @Query("SELECT COUNT(*) FROM weather_table WHERE city = :city AND date = :date")
    suspend fun countWeatherByCityAndDate(city: String, date: String): Int
}
