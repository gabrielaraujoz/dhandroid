package com.gabrielaraujoz.aula24_exercicio

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.gabrielaraujoz.aula24_exercicio.users.UserService
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class SignupFragment : Fragment() {


    private lateinit var activity: userService


    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val main = super.getActivity()
        val button = view.findViewById<Button>(R.id.btnSignup)


        button.setOnClickListener() {

            val username = view.findViewById<TextInputEditText>(R.id.txtSignupUsername)
            val txtUsername = username.text.toString()
            val password = view.findViewById<TextInputEditText>(R.id.txtSignupPassword)
            val txtPassword = password.text.toString()
            val passwordConfirmed = view.findViewById<TextInputEditText>(R.id.txtSignupConfirmPassword)
            val txtPasswordConfirmed = passwordConfirmed.text.toString()
            val termsOfUse = view.findViewById<CheckBox>(R.id.checkPrivacy)

            if (txtUsername.isEmpty()) {
                username.error = "Campo vazio."
            } else if (txtPassword.isEmpty()) {
                password.error = "Campo vazio."
            } else if (txtPasswordConfirmed.isEmpty()) {
                passwordConfirmed.error = "Campo vazio."
            } else if (txtPassword != txtPasswordConfirmed) {
                Toast.makeText(main, "As senhas devem ser iguais", Toast.LENGTH_LONG).show()
            } else if (!termsOfUse.isChecked){
                termsOfUse.error = "Por favor, aceite os termos de uso."

            } else {
                try {
                    UserService.register(txtUsername, txtPassword)
                    Toast.makeText(main, "Conta criada com sucesso!", Toast.LENGTH_LONG).show()
                    LoginFragment.apply {
                        arguments = Bundle().apply {
                            putString("USERNAME", txtUsername)
                        }
                    }

                } catch (e: Exception) {
                    Toast.makeText(main, e.message, Toast.LENGTH_LONG).show()
                }
                //Snackbar.make(main, "Conta criada com sucesso!", Snackbar.LENGTH_LONG)
            }
        }
    }


}