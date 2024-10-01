package com.example.weatherapplication.ui.Forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapplication.database.ForecastEntity
import com.example.weatherapplication.database.WeatherDatabase
import com.example.weatherapplication.databinding.FragmentDashboardBinding
import com.example.weatherapplication.ui.currentWeather.CurrentWeatherViewModel
import com.example.weatherapplication.ui.adapter.ForecastAdapter
import kotlinx.coroutines.launch

class ForecastFragment : Fragment() {
    private var binding: FragmentDashboardBinding? = null
    private var forecastAdapter: ForecastAdapter? = null
    private lateinit var db: WeatherDatabase

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val forecastViewModel =
            ViewModelProvider(requireActivity()).get(CurrentWeatherViewModel::class.java)

        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding!!.root
        val db = WeatherDatabase.getDatabase(requireContext())

        forecastViewModel.callForecastApi()
        binding!!.recyclerViewForecast.layoutManager = LinearLayoutManager(activity)
        forecastViewModel.getforecastData()
            .observe(
                viewLifecycleOwner
            ) { response ->
                lifecycleScope.launch {
                    // Insert forecast
                    //val forecast = ForecastEntity(cityName = "New York", date = "2024-09-28", temperature = 24.0, description = "Partly Cloudy")
                    //db.forecastDao().insert(forecast)

                    // Check forecast
                    //val count = db.forecastDao().countForecastsByCityAndDate("New York", "2024-09-28")
                    //println("Forecast count for New York on 2024-09-28: $count")
                }

                if (response != null) {
                    forecastAdapter = ForecastAdapter(requireActivity(), response?.list!!)
                    binding!!.recyclerViewForecast.adapter = forecastAdapter
                }
            }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}