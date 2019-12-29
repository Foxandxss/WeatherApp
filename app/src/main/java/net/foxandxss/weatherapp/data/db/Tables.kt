package net.foxandxss.weatherapp.data.db

object CityForecastTable {
    const val NAME = "CityForest"
    const val ID = "_id"
    const val CITY = "CITY"
    const val COUNTRY = "COUNTRY"
}

object DayForecastTable {
    const val NAME = "DayForecast"
    const val ID = "_id"
    const val DATE = "date"
    const val DESCRIPTION = "description"
    const val HIGH = "high"
    const val LOW = "low"
    const val ICON_URL = "iconUrl"
    const val CITY_ID = "cityId"
}