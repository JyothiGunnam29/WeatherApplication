package com.example.weatherapplication.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.weatherapplication.R
import com.example.weatherapplication.data.ForecastResult.ListBean
import com.example.weatherapplication.ui.Utils
import com.example.weatherapplication.ui.Utils.getDatefromtimestamp
import com.example.weatherapplication.ui.adapter.ForecastAdapter.ForecastViewHolder

class ForecastAdapter(private val context: Context, private val forecastList: List<ListBean>) :
    RecyclerView.Adapter<ForecastViewHolder>() {
    class ForecastViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textDate: TextView = itemView.findViewById(R.id.textDate)
        var textTemperature: TextView = itemView.findViewById(R.id.textTemperature)
        var textTemperatureHigh: TextView = itemView.findViewById(R.id.textTempHigh)
        var textTemperatureLow: TextView = itemView.findViewById(R.id.textTempLow)
        var textDescription: TextView = itemView.findViewById(R.id.textDescription)
        var weatherIcon: ImageView = itemView.findViewById(R.id.weather_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_forecast, parent, false)
        return ForecastViewHolder(view)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        val forecast = forecastList[position]
        val context = context
        holder.textDate.text = getDatefromtimestamp(forecast.dt)
        holder.textTemperatureLow.text = "Temp Low: " + forecast.main!!.temp_min + "°C"
        holder.textTemperatureHigh.text = "Temp High: " + forecast.main!!.temp_max + "°C"
        holder.textTemperature.text = "Temp: " + forecast.main!!.temp + "°C"
        holder.textDescription.text = forecast.weather!![0].description
        Glide.with(context).load(Utils.loadWeatherIcons(forecast.weather!![0].icon))
            .into(holder.weatherIcon)
    }

    override fun getItemCount(): Int {
        return forecastList.size
    }
}

