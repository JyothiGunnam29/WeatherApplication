package com.example.weatherapplication.ui.currentWeather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapplication.data.ForecastResult
import com.example.weatherapplication.data.WeatherResult
import com.example.weatherapplication.ui.Forecast.ForeCastWeatherRepository

class CurrentWeatherViewModel : ViewModel() {
    private var weatherResult = MutableLiveData<WeatherResult?>()
    var currentWeatherRepository: CurrentWeatherRepository = CurrentWeatherRepository()

    private var forecastResult = MutableLiveData<ForecastResult?>()
    var foreCastWeatherRepository: ForeCastWeatherRepository

    var City: String? = null

    init {
        weatherResult = currentWeatherRepository.getcurrentResponseLiveData()
        foreCastWeatherRepository = ForeCastWeatherRepository()
        forecastResult = foreCastWeatherRepository.getcurrentResponseLiveData()
    }

    val weatherData: MutableLiveData<WeatherResult?>
        get() = weatherResult

    fun callApi(city: String?) {
        City = city
        currentWeatherRepository.callweatherAPI(city!!)
    }

    fun getforecastData(): MutableLiveData<ForecastResult?> {
        return forecastResult
    }

    fun callForecastApi() {
        City?.let { foreCastWeatherRepository.callforecastAPI(it) }
    }
}