package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCreateAcc.setOnClickListener() {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener() {
            val email = loginEmail.text.toString()
            val password = loginPassword.text.toString()

            if (email.isEmpty()) {
                loginEmail.error = getString(R.string.empty_field)
            } else if(password.isEmpty()) {
                loginPassword.error = getString(R.string.empty_field)
            }

            try {
                if (UserService.logIn(email, password) == null) {
                    throw Exception(getString(R.string.wrong_login))
                } else {
                    val user = UserService.logIn(email, password)
                    val intent = Intent(this, WelcomeScreen::class.java)
                    intent.putExtra("USERNAME", user?.name)
                    startActivity(intent)
                    finish()
                }
            }
            catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}