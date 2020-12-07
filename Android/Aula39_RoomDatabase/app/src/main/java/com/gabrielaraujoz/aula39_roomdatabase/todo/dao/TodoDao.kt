package com.gabrielaraujoz.aula39_roomdatabase.todo.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity

@Dao
interface TodoDao {

    @Insert
    suspend fun addTodo(todo: TodoEntity)

    @Query("SELECT * FROM Todo")
    suspend fun getTodo() : List<TodoEntity>
}