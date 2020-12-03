package com.gabrielaraujoz.aula39_roomdatabase.todo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity
import com.gabrielaraujoz.aula39_roomdatabase.todo.repository.TodoRepository
import kotlinx.coroutines.Dispatchers

class TodoViewModel(private val repository: TodoRepository): ViewModel() {

    private val _todos = ArrayList<TodoEntity>()
    val todos = MutableLiveData<List<TodoEntity>>()

    fun addTodo(todo: TodoEntity) = liveData(Dispatchers.IO) {
        repository.addTodo(todo)
        _todos.add(todo)
        todos.value = _todos
        emit(todos)
    }

    fun count() = liveData(Dispatchers.IO) {
        val count = repository.count()
        emit(count)
    }

    class TodoViewModelFactory (
        private val repository: TodoRepository
    ): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return TodoViewModel(repository) as T
        }
    }
}