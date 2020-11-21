package com.gabrielaraujoz.chucknorrisapi.lista.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.gabrielaraujoz.chucknorrisapi.R
import com.gabrielaraujoz.chucknorrisapi.lista.model.JokeModel
import com.gabrielaraujoz.chucknorrisapi.lista.repository.JokesRepository
import com.gabrielaraujoz.chucknorrisapi.lista.viewmodel.JokeViewModel
import com.squareup.picasso.Picasso


class JokeFragment : Fragment() {

    private lateinit var _viewModel: JokeViewModel
    private lateinit var _view: View
    private var category: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_joke, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _view = view

        category = arguments?.getString("category")


        _viewModel = ViewModelProvider(
            this,
            JokeViewModel.JokeViewModelFactory(JokesRepository())
        ).get(JokeViewModel::class.java)

        _viewModel.getJoke(category!!).observe(viewLifecycleOwner, {
            showResults(it)
        })

    }

    private fun showResults(joke: JokeModel) {

        val jokeImage = _view.findViewById<ImageView>(R.id.imgJoke)
        val jokeText = _view.findViewById<TextView>(R.id.txtJoke)

        jokeText.text = joke.joke
        Picasso.get()
            .load(joke.icon_url)
            .into(jokeImage)
    }
}