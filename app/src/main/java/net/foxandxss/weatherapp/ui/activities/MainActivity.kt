package net.foxandxss.weatherapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import net.foxandxss.weatherapp.ui.adapters.ForecastListAdapter
import net.foxandxss.weatherapp.R
import net.foxandxss.weatherapp.domain.commands.RequestForecastCommand
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)

        doAsync() {
            val result = RequestForecastCommand("2978105").execute()
            uiThread {
                forecastList.adapter = ForecastListAdapter(result) { toast(it.date) }
            }
        }

    }
}
