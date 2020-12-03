package com.gabrielaraujoz.aula39_roomdatabase.todo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.aula39_roomdatabase.R
import com.gabrielaraujoz.aula39_roomdatabase.db.AppDatabase
import com.gabrielaraujoz.aula39_roomdatabase.todo.entity.TodoEntity
import com.gabrielaraujoz.aula39_roomdatabase.todo.repository.TodoRepository
import com.gabrielaraujoz.aula39_roomdatabase.todo.viewmodel.TodoViewModel
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText


class TodoFragment : Fragment() {

    lateinit var _viewModel: TodoViewModel
    lateinit var _view: View
    private val _fixedID = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _view = view

        val addButton = _view.findViewById<MaterialButton>(R.id.btnAddTodo)
        val inputTodo = _view.findViewById<TextInputEditText>(R.id.txtInputTodo)

        addButton.setOnClickListener() {
            val text = inputTodo.text.toString()

            if (text.isEmpty()) {
                inputTodo.error = "Please fill in your new To do!"
            }

            val newTodo = TodoEntity(_fixedID, text)

            addTodo(newTodo)
            _viewModel.getTodo()

        }


        _viewModel = ViewModelProvider(
            this,
            TodoViewModel.TodoViewModelFactory(TodoRepository(AppDatabase.getDatabase(view.context).todoDao()))
        ).get(TodoViewModel::class.java)



        _viewModel.getTodo().observe(viewLifecycleOwner, Observer {
            createList(it)
        })





    }

    fun addTodo(todo: TodoEntity) {
        _viewModel.addTodo(todo)
    }

    fun createList(todos: List<TodoEntity>) {
        val recyclerView = _view.findViewById<RecyclerView>(R.id.lista)
        val manager = LinearLayoutManager(context)

        val todoAdapter = TodoAdapter(todos)

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = todoAdapter
        }
    }


}