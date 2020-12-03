package com.gabrielaraujoz.aula39_roomdatabase.todo.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.aula39_roomdatabase.R
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity

class TodoViewHolder (private val view: View): RecyclerView.ViewHolder(view) {

    private val name = view.findViewById<TextView>(R.id.txtTodoRecycler)

    fun bind (todo: TodoEntity) {
        name.text = todo.name
    }

}
