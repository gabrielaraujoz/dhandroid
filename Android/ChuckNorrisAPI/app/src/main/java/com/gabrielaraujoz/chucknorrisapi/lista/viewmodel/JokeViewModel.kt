package com.gabrielaraujoz.chucknorrisapi.lista.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.gabrielaraujoz.chucknorrisapi.lista.model.JokeModel
import com.gabrielaraujoz.chucknorrisapi.lista.repository.CategoriesRepository
import com.gabrielaraujoz.chucknorrisapi.lista.repository.JokesRepository
import kotlinx.coroutines.Dispatchers

class JokeViewModel (
    private val repository: JokesRepository
): ViewModel() {
    private lateinit var _joke: JokeModel

    fun getJoke(category: String? = null) = liveData(Dispatchers.IO) {

        val response = repository.getJoke(category)
        _joke = response

        emit(response)

    }

    class JokeViewModelFactory (
        private val repository: JokesRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return JokeViewModel(repository) as T
        }
    }
}