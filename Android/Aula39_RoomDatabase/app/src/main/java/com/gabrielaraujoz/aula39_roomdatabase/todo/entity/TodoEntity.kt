package com.gabrielaraujoz.aula39_roomdatabase.todo.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Todo")
data class TodoEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo
    var name: String
)