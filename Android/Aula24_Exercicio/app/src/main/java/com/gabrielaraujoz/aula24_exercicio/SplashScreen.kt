package com.gabrielaraujoz.aula24_exercicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        animaTexto() //Plus do plus

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    private fun animaTexto() {
        val appName = findViewById<TextView>(R.id.appName)

        appName.alpha = 0f
        appName.y = 1000f
        appName.scaleX = 0.1f
        appName.scaleY = 0.1f

        appName.animate()
                .alpha(1f)
                .y(800f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(1500)
                .setListener(null)

    }

}