package com.gabrielaraujoz.aula41_exercicio_shared_preferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnEntrar)
        val checkbox = findViewById<CheckBox>(R.id.checkBox)

        val prefs = getSharedPreferences(SplashScreen.APP_NAME, MODE_PRIVATE)

        checkbox.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean(SplashScreen.KEEP_CONNECTED_PREFS, isChecked).apply()
        }


        button.setOnClickListener() {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}