package com.example.weatherapplication.ui.currentWeather

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.bumptech.glide.util.Util
import com.example.weatherapplication.R
import com.example.weatherapplication.data.WeatherResult
import com.example.weatherapplication.database.WeatherDao
import com.example.weatherapplication.database.WeatherDatabase
import com.example.weatherapplication.database.WeatherDatabase.Companion.getDatabase
import com.example.weatherapplication.database.WeatherEntity
import com.example.weatherapplication.databinding.FragmentHomeBinding
import com.example.weatherapplication.ui.Utils
import com.example.weatherapplication.ui.Utils.getDatefromtimestamp
import com.example.weatherapplication.ui.Utils.showToast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Locale

class CurrentWeatherFragment : Fragment() {
    private var binding: FragmentHomeBinding? = null
    var currentWeatherViewModel: CurrentWeatherViewModel? = null
    private var weatherDao: WeatherDao? = null
    var database: WeatherDatabase? = null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        currentWeatherViewModel =
            ViewModelProvider(requireActivity()).get(CurrentWeatherViewModel::class.java)

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding!!.root

        /*   // Initialize Room database
           val database = WeatherDatabase.getDatabase(this)
           weatherDao = database.weatherDao()*/
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                // Initialize Room database
                database = context?.let { getDatabase(it) }
                weatherDao = database!!.weatherDao()
                //weatherDao?.insert(weatherEntity);
            }
        }

        currentWeatherViewModel!!.weatherData.observe(
            viewLifecycleOwner
        ) { value ->
            if (value != null) {
                addtoDB(value)

                updateUI(value)
            }
        }
        setupSearch()

        return root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun addtoDB(weatherResponse: WeatherResult) {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val count =
                    database?.weatherDao()
                        ?.countWeatherByCityAndDate(
                            weatherResponse.name.toString(),
                            Utils.getCurrentDateString()
                        )
                println("Inserted weather count $count ${weatherResponse.name.toString()} on ${Utils.getCurrentDateString()}")
                if (count == 0) {
                    // No existing record, so insert the new forecast
                    val weatherEntity = WeatherEntity(
                        weatherResponse.name!!,
                        weatherResponse.main!!.temp,
                        weatherResponse.main!!.temp_max,
                        weatherResponse.main!!.temp_min,
                        Utils.getCurrentDateString(),
                        weatherResponse.main!!.humidity,
                        weatherResponse.wind!!.speed.toInt(),
                        weatherResponse.weatherList!![0].description!!
                    )
                    database?.weatherDao()?.insert(weatherEntity)
                    println("Inserted weather for ${weatherResponse.name} on ${Utils.getCurrentDateString()}")
                } else {
                    println("Weather data already exists for ${weatherResponse.name} on ${Utils.getCurrentDateString()}.")
                    loadData(weatherResponse.name.toString())

                }
                /* val weatherList = weatherDao!!.getAllWeather()
                 val result = if (weatherList.isNotEmpty()) {
                     weatherList.joinToString("\n") {
                         "${it.city}: ${it.temperature}°C, ${it.description}, ${it.date}"
                     }
                 } else {
                     "No data available"
                 }
                 Log.d("from database", result)*/
            }
        }
    }

    private fun updateUI(response: WeatherResult) {
        binding!!.textTemp.text = response.main!!.temp.toString() + "°C"
        binding!!.textDate.text = getDatefromtimestamp(response.dt)
        binding!!.textCity.text = response.name
        binding!!.textHigh.text = "H " + response.main!!.temp_max.toString() + "°C"
        binding!!.textLow.text = "L " + response.main!!.temp_min.toString() + "°C"
        binding!!.textWeather.text = response.weatherList!![0].description
        binding!!.txtWind.text = response.wind!!.speed.toString() + " kph"
        binding!!.txtHumidity.text = response.main!!.humidity.toString() + " %"
        loadBackgroundbg(response.weatherList!![0].main!!)
    }

    private fun loadBackgroundbg(icon: String) {
        if (icon.lowercase(Locale.getDefault()).contains("snow")) {
            binding!!.background.background = requireActivity().getDrawable(R.drawable.snow_bg)
        } else if (icon.lowercase(Locale.getDefault())
                .contains("rain")
        ) {
            binding!!.background.background = requireActivity().getDrawable(R.drawable.rainy_bg)
        } else if (icon.lowercase(Locale.getDefault())
                .contains("haze")
        ) {
            binding!!.background.background = requireActivity().getDrawable(R.drawable.haze_bg)
        } else if (icon.lowercase(Locale.getDefault())
                .contains("cloud")
        ) {
            binding!!.background.background = requireActivity().getDrawable(R.drawable.cloudy_bg)
        } else if (icon.lowercase(Locale.getDefault())
                .contains("sunny")
        ) {
            binding!!.background.background = requireActivity().getDrawable(R.drawable.sunny_bg)
        }

        Glide.with(requireActivity()).load(Utils.loadWeatherIcons(icon))
            .into(binding!!.weatherIcon)
    }

    private fun setupSearch() {
        binding!!.searchCity.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onQueryTextSubmit(query: String): Boolean {
                if (query.isNotEmpty())
                    setData(query)
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setData(city: String) {
        if (!Utils.isNetworkAvailable(requireActivity())) {
            showToast(requireActivity(), "You are currently offline")
            return
        }
        lifecycleScope.launch {
            val count: Int = database?.weatherDao()
                ?.countWeatherByCityAndDate(city, Utils.getCurrentDateString())!!
            if (count > 0) {
                loadData(city)
            } else
                if (count == 0 && Utils.isNetworkAvailable(requireActivity())) {
                    //showToast(requireActivity(),"Data not present calling api")
                    currentWeatherViewModel!!.callApi(city)
                }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun loadData(city: String) {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val weatherEntity = database?.weatherDao()
                    ?.getWeatherByCity(
                        city,
                        Utils.getCurrentDateString()
                    )
                // Update the UI on the main thread
                withContext(Dispatchers.Main) {
                    showToast(requireActivity(), "Data present fetching from DB")
                    binding!!.textTemp.text =
                        weatherEntity!!.temperature.toString() + "°C"
                    binding!!.textDate.text = weatherEntity.date
                    binding!!.textCity.text = weatherEntity.city
                    binding!!.textHigh.text =
                        "H " + weatherEntity.tempH.toString() + "°C"
                    binding!!.textLow.text =
                        "L " + weatherEntity.tempL.toString() + "°C"
                    binding!!.textWeather.text = weatherEntity.description
                    binding!!.txtHumidity.text = weatherEntity.humidity.toString()
                    binding!!.txtWind.text = weatherEntity.wind.toString()
                    loadBackgroundbg(weatherEntity.description)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}