package com.gabrielaraujoz.chucknorrisapi.lista.repository

import com.gabrielaraujoz.chucknorrisapi.data.api.NetworkUtils
import com.gabrielaraujoz.chucknorrisapi.lista.model.JokeModel
import retrofit2.http.GET
import retrofit2.http.Query

interface JokesEndpoint {

    @GET("random")
    suspend fun getJoke(@Query("category") category: String?): JokeModel

    companion object {
        val endpoint: CategoriesEndpoint by lazy {
            NetworkUtils.getRetrofitInstance().create(CategoriesEndpoint::class.java)
        }
    }
}