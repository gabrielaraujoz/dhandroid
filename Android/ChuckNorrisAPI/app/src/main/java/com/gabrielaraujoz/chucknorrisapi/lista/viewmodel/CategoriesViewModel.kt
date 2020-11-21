package com.gabrielaraujoz.chucknorrisapi.lista.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.gabrielaraujoz.chucknorrisapi.lista.repository.CategoriesRepository
import kotlinx.coroutines.Dispatchers

class CategoriesViewModel (
    private val repository: CategoriesRepository
): ViewModel() {

    private lateinit var _categories: List<String>


    fun getCategories() = liveData(Dispatchers.IO) {
        val response = repository.getCategories()
        _categories = response

        emit(response)
    }

    class ListViewModelFactory (
        private val repository: CategoriesRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return CategoriesViewModel(repository) as T
        }
    }

}