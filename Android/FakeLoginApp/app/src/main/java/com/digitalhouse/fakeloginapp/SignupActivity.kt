package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        buttonBackLogin.setOnClickListener() {
            finish()
        }

        checkPrivacy.setOnCheckedChangeListener { _, isChecked ->
            buttonSignUp.isEnabled = isChecked
        }

        buttonSignUp.setOnClickListener() {
            val name = signUpName.text.toString()
            val email = signUpEmail.text.toString()
            val password = signUpPassword.text.toString()

            if (name.isEmpty()) {
                signUpName.error = getString(R.string.empty_field)
            } else if (email.isEmpty()) {
                signUpEmail.error = getString(R.string.empty_field)
            } else if (password.isEmpty()) {
                signUpEmail.error = getString(R.string.empty_field)
            } else {

                try {
                    UserService.register(name, email, password)
                    Toast.makeText(this, getString(R.string.signup_sucess_message), Toast.LENGTH_SHORT).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}