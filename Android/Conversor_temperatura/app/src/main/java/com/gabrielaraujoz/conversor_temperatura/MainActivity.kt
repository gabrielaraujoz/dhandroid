package com.gabrielaraujoz.conversor_temperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversorMain.setOnClickListener() {
            if (tempInputMain.text.isNotEmpty()) {
                val tempCelsius = tempInputMain.text.toString().toFloat()
                val tempFahrenheit = ((tempCelsius * 9) / 5) + 32
                showResultMain.text = "$tempFahrenheit ºF"
                showResultMain.visibility = View.VISIBLE
            } else {
                tempInputMain.error = getString(R.string.insert_temp)
                showResultMain.visibility = View.GONE
            }
        }
    }
}