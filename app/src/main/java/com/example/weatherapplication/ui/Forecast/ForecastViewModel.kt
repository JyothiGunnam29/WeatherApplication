package com.example.weatherapplication.ui.Forecast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapplication.data.ForecastResult

class ForecastViewModel : ViewModel() {
    private var forecastResult = MutableLiveData<ForecastResult?>()
    var foreCastWeatherRepository: ForeCastWeatherRepository = ForeCastWeatherRepository()

    init {
        forecastResult = foreCastWeatherRepository.getcurrentResponseLiveData()
    }

    fun getforecastData(): MutableLiveData<ForecastResult?> {
        return forecastResult
    }

    fun callApi(city: String?) {
        city?.let { foreCastWeatherRepository.callforecastAPI(it) }
    }
}