package com.example.weatherapplication.ui.Forecast

import androidx.lifecycle.MutableLiveData
import com.example.weatherapplication.data.ForecastResult
import com.example.weatherapplication.network.ApiClient.client
import com.example.weatherapplication.network.WeatherAPI
import com.example.weatherapplication.ui.WeatherApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ForeCastWeatherRepository {
    private val forecastResponseLiveData = MutableLiveData<ForecastResult?>()

    fun callforecastAPI(city: String) {
        val forecastdata: Call<ForecastResult?>
        //call the API for specific city query param
        val apiInterface = client!!.create(WeatherAPI::class.java)
        val lat: Double = WeatherApplicationClass.instance?.fusedLocation?.current_lat!!
        val lon: Double = WeatherApplicationClass.instance?.fusedLocation?.current_lon!!
        if (city.isEmpty() && lat != 0.0 && lon != 0.0) forecastdata =
            apiInterface.getForecastCurrent(lat, lon)!!
        else forecastdata = apiInterface.getForecastData(city)!!
        //start doing the network communication
        forecastdata.enqueue(object : Callback<ForecastResult?> {
            override fun onResponse(
                call: Call<ForecastResult?>,
                response: Response<ForecastResult?>
            ) {
                if (response.body() != null) forecastResponseLiveData.postValue(response.body())
            }

            override fun onFailure(call: Call<ForecastResult?>, throwable: Throwable) {
                forecastResponseLiveData.postValue(null)
            }
        })
    }

    fun getcurrentResponseLiveData(): MutableLiveData<ForecastResult?> {
        return forecastResponseLiveData
    }
}
