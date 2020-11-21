package com.gabrielaraujoz.chucknorrisapi.lista.repository

class CategoriesRepository {
    private val client = CategoriesEndpoint.endpoint

    suspend fun getCategories() = client.getCategories()

}