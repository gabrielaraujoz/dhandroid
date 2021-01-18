package com.gabrielaraujoz.aula46_realtimedatabase

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class MainActivity : AppCompatActivity() {

    data class Usuario (val nome: String = "", val idade: Int = -1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        //isso aqui cria um nó raiz (ponto principal do JSON)
        val myRef = database.getReference("usuario")
//        val myRef2 = database.getReference("furniture")

        myRef.setValue(Usuario("Gabriel", 28))
//        myRef2.setValue("Sofa")
//
//        // se colocamos child, ele vai apagar o value da mãe e deixar só como filho
//        myRef.child("endereco").setValue("São Paulo")

        // Read from the database
        // Read from the database
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(Usuario::class.java)
                Log.d("TAG", "Value is: $value")
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w("TAG", "Failed to read value.", error.toException())
            }
        })

    }
}