package net.foxandxss.weatherapp.data
import com.google.gson.Gson
import java.net.URL

class ForecastRequest(private val id: Long) {
    companion object {
        private const val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private const val URL = "https://api.openweathermap.org/data/2.5/" +
                 "forecast/daily?mode=json&units=metric&cnt=7"
        private const val COMPLETE_URL = "$URL&APPID=$APP_ID&id="
    }

    fun execute(): ForecastResult {
        val forecastJsonStr = URL(COMPLETE_URL + id).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}