package com.gabrielaraujoz.chucknorrisapi.lista.repository

class JokesRepository {
    private val client = JokesEndpoint.endpoint

    suspend fun getJoke(category: String?) = client.getJoke(category)

}