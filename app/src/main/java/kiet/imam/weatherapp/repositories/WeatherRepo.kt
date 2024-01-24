package kiet.imam.weatherapp.repositories

import kiet.imam.weatherapp.Models.BaseModel
import kiet.imam.weatherapp.Models.DailyForecasts
import kiet.imam.weatherapp.Models.HourlyForecast
import kiet.imam.weatherapp.Models.Location
import retrofit2.http.Query
interface WeatherRepo {
    suspend fun searchLocation(query:String):BaseModel<List<Location>>
    suspend fun getDailyForecasts(locationKey:String):BaseModel<DailyForecasts>
    suspend fun getHourlyForecasts(locationKey: String):BaseModel<List<HourlyForecast>>
}