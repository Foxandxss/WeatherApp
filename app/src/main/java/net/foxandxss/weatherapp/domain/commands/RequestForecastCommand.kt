package net.foxandxss.weatherapp.domain.commands

import net.foxandxss.weatherapp.data.ForecastRequest
import net.foxandxss.weatherapp.domain.mappers.ForecastDataMapper
import net.foxandxss.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val cityId: Long) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(cityId)
        return ForecastDataMapper().convertFromDataModel(cityId, forecastRequest.execute())
    }
}