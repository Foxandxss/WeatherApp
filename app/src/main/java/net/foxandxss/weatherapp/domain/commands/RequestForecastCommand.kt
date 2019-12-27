package net.foxandxss.weatherapp.domain.commands

import net.foxandxss.weatherapp.data.ForecastRequest
import net.foxandxss.weatherapp.domain.mappers.ForecastDataMapper
import net.foxandxss.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val id: String): Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(id)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}