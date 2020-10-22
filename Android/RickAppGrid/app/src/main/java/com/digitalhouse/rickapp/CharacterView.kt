package com.digitalhouse.rickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_character_view.*
import kotlinx.android.synthetic.main.card_view.*
import kotlinx.android.synthetic.main.card_view.cardImage

class CharacterView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_view)
        var nome = intent.getStringExtra("Nome")
        var genero = intent.getStringExtra("Genero")
        var planeta = intent.getStringExtra("Location")
        var imagem = intent.getStringExtra("Imagem")

        Picasso.get().load(imagem).into(findViewById<ImageView>(R.id.cardImage))

        findViewById<TextView>(R.id.txtCharacterViewCharacterName).text = nome
        findViewById<TextView>(R.id.txtCharacterViewGender).text = genero
        findViewById<TextView>(R.id.txtCharacterViewLocation).text = planeta
    }
}