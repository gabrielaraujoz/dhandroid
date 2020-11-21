package com.gabrielaraujoz.chucknorrisapi.lista.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.chucknorrisapi.R
import java.util.*

class CategoryViewHolder (
    view: View
): RecyclerView.ViewHolder(view) {

    private val catName = view.findViewById<TextView>(R.id.txtCatName)

    fun bind(category: String) {
        catName.text = category.capitalize(Locale.getDefault())
    }

}
