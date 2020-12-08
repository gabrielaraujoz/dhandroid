package com.gabrielaraujoz.aula41_exercicio_shared_preferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val prefs = getSharedPreferences(APP_NAME, MODE_PRIVATE)
        val prefsChecked = prefs.getBoolean(KEEP_CONNECTED_PREFS, false)

        Handler(Looper.getMainLooper()).postDelayed({

            if (prefsChecked) {
                val intentHome = Intent(this, HomeActivity::class.java)
                startActivity(intentHome)
                finish()

            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 3000)
    }

    companion object {
        const val APP_NAME = "Aula41_Exercicio_Shared_Preferences"
        const val KEEP_CONNECTED_PREFS = "KEEP_CONNECTED_PREFS"
    }
}