package com.gabrielaraujoz.aula39_roomdatabase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gabrielaraujoz.aula39_roomdatabase.todo.dao.TodoDao
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity

@Database(
    entities = [TodoEntity::class],
    version = 1,
    exportSchema = false
)

abstract class AppDatabase: RoomDatabase() {


    abstract fun todoDao(): TodoDao

    companion object {

        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "livraria"
                ).build()
            }

            return INSTANCE!!
        }
    }
}