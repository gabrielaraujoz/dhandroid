package com.gabrielaraujoz.aula39_roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabrielaraujoz.aula39_roomdatabase.todo.view.TodoFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment, TodoFragment())
            .commit()
    }
}