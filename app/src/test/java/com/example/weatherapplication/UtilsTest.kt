package com.example.weatherapplication

import junit.framework.TestCase.assertEquals
import org.junit.Test

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.example.weatherapplication.ui.Utils
import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class UtilsTest {

    @Mock
    lateinit var context: Context

    @Mock
    lateinit var connectivityManager: ConnectivityManager

    @Mock
    lateinit var networkInfo: NetworkInfo

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    // Test for getDatefromtimestamp
    @Test
    fun `testgetDatefromtimestamp`() {
        val timestamp = 1632844800L // Example Unix timestamp
        val expectedDate = "28-09-2021 21:30 pm"
        val result = Utils.getDatefromtimestamp(timestamp)
        assertEquals(expectedDate, result)
    }

    // Test for loadWeatherIcons
    @Test
    fun `testloadWeatherIcons`() {
        val iconCode = "10d"
        val expectedUrl = "https://openweathermap.org/img/w/10d.png"
        val result = Utils.loadWeatherIcons(iconCode)
        assertEquals(expectedUrl, result)
    }

    // Test for getCurrentDateString
    @Test
    fun `testgetCurrentDateStringreturnscorrectdateformat`() {
        val currentDate = Utils.getCurrentDateString()
        assertTrue(currentDate.matches(Regex("\\d{2}-\\d{2}-\\d{4}")))
    }

    // Test for isNetworkAvailable
    @Test
    fun `testisNetworkAvailable`() {
        Mockito.`when`(context.getSystemService(Context.CONNECTIVITY_SERVICE)).thenReturn(connectivityManager)
        Mockito.`when`(connectivityManager.activeNetworkInfo).thenReturn(networkInfo)
        Mockito.`when`(networkInfo.isConnected).thenReturn(true)

        val result = Utils.isNetworkAvailable(context)
        assertTrue(result)
    }

    @Test
    fun `testisNetworkAvailablereturnsfalsewhennetworkisdisconnected`() {
        Mockito.`when`(context.getSystemService(Context.CONNECTIVITY_SERVICE)).thenReturn(connectivityManager)
        Mockito.`when`(connectivityManager.activeNetworkInfo).thenReturn(networkInfo)
        Mockito.`when`(networkInfo.isConnected).thenReturn(false)

        val result = Utils.isNetworkAvailable(context)
        assertFalse(result)
    }


}

