package com.gabrielaraujoz.rgbcolorselector

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.fragment_color_selector.*


/**
 * A simple [Fragment] subclass.
 * Use the [ColorSelector.newInstance] factory method to
 * create an instance of this fragment.
 */
class ColorSelector : Fragment(), Colors {

    private lateinit var activity: Colors

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Colors) activity = context
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_color_selector, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var red = 0
        var green = 0
        var blue = 0

        sliderRed.addOnChangeListener () { _, value, _ ->
            red = value.toInt()
            txtInputRed.hint = red.toString()
            activity.changeColor(red, green, blue)
        }

        txtInputRed.doOnTextChanged { text, start, count, after ->
                if (text.isNullOrEmpty()){
                    txtInputRed.error = "O campo não pode ser vazio"
                } else {

                    red = text.toString().toInt()
                    sliderRed.value = red.toFloat()
                    activity.changeColor(red, green, blue)
                }
            }

        sliderGreen.addOnChangeListener () { _, value, _ ->
            green = value.toInt()
            txtInputGreen.hint = green.toString()
            activity.changeColor(red, green, blue)
        }

        txtInputGreen.doOnTextChanged { text, start, count, after ->
            if (text.isNullOrEmpty()){
                txtInputGreen.error = "O campo não pode ser vazio"
            } else {
                green = text.toString().toInt()
                sliderGreen.value = green.toFloat()
                activity.changeColor(red, green, blue)
            }
        }

        sliderBlue.addOnChangeListener () { _, value, _ ->
            blue = value.toInt()
            txtInputBlue.hint = blue.toString()
            activity.changeColor(red, green, blue)
        }

        txtInputBlue.doOnTextChanged { text, start, count, after ->
            if (text.isNullOrEmpty()){
                txtInputBlue.error = "O campo não pode ser vazio"
            } else {
                blue = text.toString().toInt()
                sliderBlue.value = blue.toFloat()
                activity.changeColor(red, green, blue)
            }
        }

    }

    override fun changeColor(r: Int, g: Int, b: Int) {
        TODO("Not yet implemented")
    }


}