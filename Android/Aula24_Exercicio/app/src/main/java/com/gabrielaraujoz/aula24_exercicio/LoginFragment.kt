package com.gabrielaraujoz.aula24_exercicio

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.gabrielaraujoz.aula24_exercicio.users.UserService
import com.google.android.material.textfield.TextInputEditText


class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null

    private lateinit var activity: userService

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("USERNAME")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btnLogin)
        val textUsername = view.findViewById<TextInputEditText>(R.id.txtLoginUsername)
        val textPassword = view.findViewById<TextInputEditText>(R.id.txtLoginPassword)
        val main = getActivity()


        button.setOnClickListener() {
            val username = textUsername?.text.toString()
            val password = textPassword?.text.toString()

            if (username.isEmpty()) {
                textUsername.error = getString(R.string.empty_field)
            } else if(password.isEmpty()) {
                textPassword.error = getString(R.string.empty_field)
            }

            try {
                if (UserService.logIn(username, password) == null) {
                    throw Exception(getString(R.string.wrong_login))
                } else {
                    val user = UserService.logIn(username, password)
                    Toast.makeText(main, "You are logged in", Toast.LENGTH_LONG).show()
                }
            }
            catch (e: Exception) {
                Toast.makeText(main, e.message, Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onResume() {
        super.onResume()
        val main = getActivity()
        arguments?.let {
            param1 = it.getString("USERNAME")
        }

        if (param1 != null) {
            Toast.makeText(main, param1.toString(), Toast.LENGTH_LONG).show()
        }
    }

    companion object {

        fun newInstance(param1: String, param2: String) =
            LoginFragment().apply {
                arguments = Bundle().apply {
                    putString("USERNAME", param1)
                }
            }
    }
}