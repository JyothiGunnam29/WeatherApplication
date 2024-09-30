package com.example.weatherapplication.ui.currentWeather

import androidx.lifecycle.MutableLiveData
import com.example.weatherapplication.data.WeatherResult
import com.example.weatherapplication.network.ApiClient.client
import com.example.weatherapplication.network.WeatherAPI
import com.example.weatherapplication.ui.WeatherApplicationClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrentWeatherRepository {
    private val weatherResponseLiveData = MutableLiveData<WeatherResult?>()

    fun callweatherAPI(city: String) {
        val weatherdata: Call<WeatherResult?>
        //call the API for specific city query param
        val apiInterface = client!!.create(WeatherAPI::class.java)
        val lat: Double = WeatherApplicationClass.instance?.fusedLocation?.current_lat!!
        val lon: Double = WeatherApplicationClass.instance?.fusedLocation?.current_lon!!
        if (city.isEmpty() && lat != 0.0 && lon != 0.0) weatherdata =
            apiInterface.getWeatherCurrent(lat, lon)!!
        else weatherdata = apiInterface.getWeatherData(city)!!
        //start doing the network communication
        weatherdata.enqueue(object : Callback<WeatherResult?> {
            override fun onResponse(
                call: Call<WeatherResult?>,
                response: Response<WeatherResult?>
            ) {
                if (response.body() != null && response.body()!!.cod == 200) weatherResponseLiveData.postValue(
                    response.body()
                )
            }

            override fun onFailure(call: Call<WeatherResult?>, throwable: Throwable) {
                // Log.d("openweatherapi", "throwable " + throwable.toString());
                weatherResponseLiveData.postValue(null)
            }
        })
    }

    fun getcurrentResponseLiveData(): MutableLiveData<WeatherResult?> {
        return weatherResponseLiveData
    }
}
