package com.example.weatherapplication

import androidx.arch.core.executor.testing.InstantTaskExecutorRule

import androidx.lifecycle.MutableLiveData

import com.example.weatherapplication.data.ForecastResult

import com.example.weatherapplication.data.WeatherResult

import com.example.weatherapplication.ui.currentWeather.CurrentWeatherRepository

import com.example.weatherapplication.ui.currentWeather.CurrentWeatherViewModel

import com.example.weatherapplication.ui.Forecast.ForeCastWeatherRepository

import org.junit.Assert.*

import org.junit.Before

import org.junit.Rule

import org.junit.Test
import org.junit.runner.RunWith

import org.mockito.Mock

import org.mockito.Mockito.*

import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CurrentWeatherViewModelTest {
    // Rule to run architecture components synchronously
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    private lateinit var viewModel: CurrentWeatherViewModel
    @Mock
    private lateinit var currentWeatherRepository: CurrentWeatherRepository
    @Mock
    private lateinit var foreCastWeatherRepository: ForeCastWeatherRepository

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        // Mock LiveData for weatherResult and forecastResult
        val weatherLiveData = MutableLiveData<WeatherResult?>()
        val forecastLiveData = MutableLiveData<ForecastResult?>()
        // Stub the repository methods
        `when`(currentWeatherRepository.getcurrentResponseLiveData()).thenReturn(weatherLiveData)

        `when`(foreCastWeatherRepository.getcurrentResponseLiveData()).thenReturn(forecastLiveData)
        // Initialize the ViewModel with mocked repositories
        viewModel = CurrentWeatherViewModel().apply {
            this.currentWeatherRepository =
                this@CurrentWeatherViewModelTest.currentWeatherRepository
            this.foreCastWeatherRepository =
                this@CurrentWeatherViewModelTest.foreCastWeatherRepository
        }
    }


  /*  @Test
    fun testWeatherDataLiveData() {
        // Check that the LiveData from ViewModel matches the repository's LiveData
        assertNotNull(viewModel.weatherData)
        assertEquals(viewModel.weatherData, currentWeatherRepository.getcurrentResponseLiveData())
    }
*/

   /* @Test
    fun testForecastDataLiveData() {
        // Check that forecast LiveData is the same as the repository's forecast LiveData
        assertNotNull(viewModel.getforecastData())
        assertEquals(
            viewModel.getforecastData(),
            foreCastWeatherRepository.getcurrentResponseLiveData()
        )
    }*/


    @Test
    fun testCallApi() {
        val city = "New York"
        // Call the API method
        viewModel.callApi(city)
        // Verify that the callweatherAPI method in repository was invoked with the correct city
        verify(currentWeatherRepository).callweatherAPI(city)
        assertEquals(viewModel.City, city)
    }


    @Test
    fun testCallForecastApi_whenCityIsNotNull() {
        val city = "San Francisco"
        viewModel.City = city
        // Call the forecast API method
        viewModel.callForecastApi()
        // Verify that the callforecastAPI method in the repository was called with the correct city
        verify(foreCastWeatherRepository).callforecastAPI(city)

    }


    @Test
    fun testCallForecastApi_whenCityIsNull() {
        // Ensure that when City is null, the API is not called
        viewModel.City = null
        // Call the forecast API method
        viewModel.callForecastApi()
        // Verify that the callforecastAPI method in the repository was NOT called
        verify(foreCastWeatherRepository, never()).callforecastAPI(anyString())
    }

}