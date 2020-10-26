package com.gabrielaraujoz.aula24_exercicio.users

import java.lang.Exception

class UserService {
    companion object {

        private val users = arrayListOf<UserModel>()

        /**
         * Realiza login
         */
        fun logIn(username: String, password: String): UserModel? {
            return users.find {
                it.username == username.toLowerCase().trim() && it.password == password
            }
        }

        /**
         * Registra um usuário
         */
        fun register(username: String,password: String) {
            // Verifica se já existe usuário com email cadastrado
            val user = users.find {
                it.username == username.toLowerCase()
            }

            if (user != null) {
                throw Exception("Usuário já cadastrado!")
            }

            users.add(UserModel(username, password))
        }
    }
}