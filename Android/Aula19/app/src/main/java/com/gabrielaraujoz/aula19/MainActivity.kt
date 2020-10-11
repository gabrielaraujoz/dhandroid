package com.gabrielaraujoz.aula19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            Toast.makeText(this, "Indo para a próxima página", Toast.LENGTH_SHORT ).show()
            val intent = Intent(this, novatela::class.java)
            intent.putExtra("NAME", "Gabriel")
            intent.putExtra("AGE", 28)
            startActivity(intent)
        }
    }

}