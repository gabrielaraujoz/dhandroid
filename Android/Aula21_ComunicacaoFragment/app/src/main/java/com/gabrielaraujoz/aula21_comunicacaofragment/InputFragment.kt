package com.gabrielaraujoz.aula21_comunicacaofragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_input.*


/**
 * A simple [Fragment] subclass.
 * Use the [InputFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InputFragment : Fragment(), changeShowFrag {

        private lateinit var activity: changeShowFrag

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is changeShowFrag) activity = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_input, container, false)



        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnCalcular.setOnClickListener {
            if (txtNome.text.isEmpty()) {
                txtNome.error = getString(R.string.insira_nome)
            } else if (txtIdade.text.isEmpty() || txtIdade.text.toString().toInt() <= 1900) {
                    txtIdade.error = getString(R.string.insira_idade)
            } else {

                val nome = txtNome.text.toString()
                val year = txtIdade.text.toString().toInt()
                activity.changeShow(nome, year)
            }

        }
    }


}