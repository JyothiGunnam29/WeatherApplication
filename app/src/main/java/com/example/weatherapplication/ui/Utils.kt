package com.example.weatherapplication.ui

import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

object Utils {
    @JvmStatic
    fun getDatefromtimestamp(timestamp: Long): String {
        val formatter = SimpleDateFormat("dd-MM-yyyy HH:mm a", Locale.getDefault())
        val dateString = formatter.format(Date(timestamp * 1000))
        return dateString
    }

    fun loadWeatherIcons(icon: String?): String {
        val iconUrl = "https://openweathermap.org/img/w/$icon.png"
        return iconUrl
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun getCurrentDateString(): String {
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy") // Format as needed
        return LocalDate.now().format(formatter)
    }

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }

    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
