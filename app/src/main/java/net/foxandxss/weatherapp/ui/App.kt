package net.foxandxss.weatherapp.ui

import android.app.Application
import net.foxandxss.weatherapp.ui.utils.DelegatesExt

class App : Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}