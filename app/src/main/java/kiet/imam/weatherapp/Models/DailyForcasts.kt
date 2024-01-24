package kiet.imam.weatherapp.Models

import com.google.gson.annotations.SerializedName

data class DailyForecasts(
    @SerializedName("DailyForecasts")
    val dailyForecasts: List<DailyForecast>
)
