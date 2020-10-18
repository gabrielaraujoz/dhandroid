package com.gabrielaraujoz.rgbcolorselector

import android.content.Context
import android.graphics.Color
import android.graphics.Color.rgb
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.graphics.toColor
import androidx.core.graphics.toColorLong
import kotlinx.android.synthetic.main.fragment_color_show.*

class MainActivity : AppCompatActivity(), Colors {

    var colorSelector = ColorSelector()
    var colorShow = ColorShow()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()
        transaction.replace(R.id.colorSelectorFrame, colorSelector)
        transaction.commit()

        val transaction2 = manager.beginTransaction()
        transaction2.replace(R.id.showColorFrame, colorShow)
        transaction2.commit()
    }


    override fun changeColor(r: Int, g: Int, b: Int) {
        var color = rgb(r, g, b)
        colorShow.txtShowColor.setBackgroundColor(color)
        colorShow.txtShowColor.text = ""
    }
}

