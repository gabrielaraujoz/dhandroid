package com.gabrielaraujoz.aula39_roomdatabase.todo.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.aula39_roomdatabase.R
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity

class TodoAdapter(private val dataSet: List<TodoEntity>): RecyclerView.Adapter<TodoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return TodoViewHolder(view)    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)
    }

    override fun getItemCount() = dataSet.size

}