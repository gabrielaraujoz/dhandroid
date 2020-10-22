package com.digitalhouse.rickapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.IRespostaDaApi
import com.digitalhouse.rickapp.api.Personagem
import com.digitalhouse.rickapp.api.RickApi
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.card_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewManager = GridLayoutManager(this,2)

        RickApi.getData(this, object: IRespostaDaApi {
            override fun obtevePersonagens(personagens: List<Personagem>) {


                val recyclerView = findViewById<RecyclerView>(R.id.minhaLista)
                val viewAdapter = MeuAdapter(personagens) { personagem ->
                    val intent = Intent(this@MainActivity, CharacterView::class.java)
                    intent.putExtra("Nome", personagem.nome)
                    intent.putExtra("Location", personagem.localizacao.nome)
                    intent.putExtra("Genero", personagem.genero)
                    intent.putExtra("Imagem", personagem.imagemUrl)
                    startActivity(intent)

                }


                recyclerView.apply {
                    setHasFixedSize(true)

                    layoutManager = viewManager
                    adapter = viewAdapter
                }


            }
        })
    }
}