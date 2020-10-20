package com.digitalhouse.rickapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.Personagem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_view.*

class MeuAdapter(private val personagens: List<Personagem>): RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val characterName by lazy {view.findViewById<TextView>(R.id.txtCardCharacterName)}
        private val characterStatus by lazy {view.findViewById<TextView>(R.id.txtCardStatus)}
        private val characterLocation by lazy {view.findViewById<TextView>(R.id.txtCardLocation)}
        private val characterImage by lazy {view.findViewById<ImageView>(R.id.cardImage)}

        fun bind (personagem: Personagem) {
            characterName.text = personagem.nome
            characterStatus.text = personagem.status + " - " + personagem.especie
            characterLocation.text = personagem.localizacao.nome
            Picasso.get().load(personagem.imagemUrl)
                                .into(characterImage)

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false )

        return MeuViewHolder(view)
    }

    override fun getItemCount() = personagens.size

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(personagens[position])
    }
}