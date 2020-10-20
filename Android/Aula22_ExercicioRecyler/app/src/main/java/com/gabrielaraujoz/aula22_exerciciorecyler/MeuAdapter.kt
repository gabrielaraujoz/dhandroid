package com.gabrielaraujoz.aula22_exerciciorecyler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeuAdapter(private val contacts: List<Contact>): RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {

    class MeuViewHolder (view: View): RecyclerView.ViewHolder(view) {
        private val contactName by lazy {view.findViewById<TextView>(R.id.contactName)}
        private val lastMessage by lazy {view.findViewById<TextView>(R.id.lastMessage)}
        private val timeStamp by lazy {view.findViewById<TextView>(R.id.timeStamp)}

        fun bind (contact: Contact) {
            contactName.text = contact.name
            lastMessage.text = contact.message
            timeStamp.text = contact.time
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuAdapter.MeuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return MeuViewHolder(view)
    }

    override fun getItemCount() = contacts.size

    override fun onBindViewHolder(holder: MeuAdapter.MeuViewHolder, position: Int) {
        holder.bind(contacts[position])
    }
}