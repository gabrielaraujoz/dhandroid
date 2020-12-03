package com.gabrielaraujoz.aula39_roomdatabase.todo.repository

import com.gabrielaraujoz.aula39_roomdatabase.todo.dao.TodoDao
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity

class TodoRepository(private val todoDao: TodoDao) {

    suspend fun addTodo(todo: TodoEntity) = todoDao.addTodo(todo)
    suspend fun getTodo() = todoDao.getTodo()

}