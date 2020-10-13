package com.gabrielaraujoz.calculadora_salario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcMain.setOnClickListener() {
            if (hourInputMain.text.isNotEmpty() && valueInputMain.text.isNotEmpty()) {
                val hoursWorked = hourInputMain.text.toString().toFloat()
                val valuePerHour = valueInputMain.text.toString().toFloat()
                val totalValue = hoursWorked * valuePerHour
                showResultMain.text = "R$ $totalValue"
                showResultMain.visibility = View.VISIBLE

            } else if (hourInputMain.text.isEmpty()) {
                hourInputMain.error = "Insira um valor aqui."
                showResultMain.visibility = View.GONE
            } else  {
                valueInputMain.error = "Insira um valor aqui."
                showResultMain.visibility = View.GONE
            }
        }
    }
}