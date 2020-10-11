package com.gabrielaraujoz.aula19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_novatela.*

class novatela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novatela)

        val name = intent.getStringExtra("NAME")
        val age = intent.getIntExtra("AGE", 0)

        txt1.text = "$name tem $age anos."

    }
}