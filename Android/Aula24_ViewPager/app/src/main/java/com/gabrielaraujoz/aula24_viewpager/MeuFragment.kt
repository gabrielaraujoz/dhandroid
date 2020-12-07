package com.gabrielaraujoz.aula24_viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class MeuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            param1 = it.getString("TEXTO")
            param2 = it.getBoolean("E_MAIOR_DE_IDADE")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_meu, container, false)
        view.findViewById<TextView>(R.id.txtFragment1).text = param1
        return view
    }


    //Companion é para implementarmos coisas estáticas - não podemos acessar métodos de fora
    // do Companion estando dentro do Companion
    companion object {
        fun newInstance(texto: String, eMaiorDeIdade: Boolean) =
            MeuFragment().apply {
                arguments = Bundle().apply {
                    putString("Texto", texto)
                    putBoolean("E_MAIOR_DE_IDADE", eMaiorDeIdade)
                }
            }
    }
}