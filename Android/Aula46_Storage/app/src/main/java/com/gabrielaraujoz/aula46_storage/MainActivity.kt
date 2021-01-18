package com.gabrielaraujoz.aula46_storage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.MimeTypeMap
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.net.toFile
import com.google.firebase.storage.FirebaseStorage
import java.lang.System.currentTimeMillis

class MainActivity : AppCompatActivity() {

    private var imageURI: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnProcurar).setOnClickListener {
            procurarArquivo()
        }

        findViewById<Button>(R.id.btnEnviar).setOnClickListener {
            enviarArquivo()
        }

    }

    fun obterArquivo() {
        val firebase = FirebaseStorage.getInstance()
        val storage = firebase.getReference("uploads")

        storage.child()
    }

    fun enviarArquivo() {
        if (imageURI != null) {
            imageURI?.run {
                val firebase = FirebaseStorage.getInstance()
                val storage = firebase.getReference("uploads")

                val extension = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(imageURI!!))

                val fileReference = storage.child("${currentTimeMillis()}.${extension}")

                fileReference.putFile(this)
                    .addOnSuccessListener {
                        //salvar o fileReference.toString no RealTimeDatabase
                        Toast.makeText(this@MainActivity, "Sucesso!", Toast.LENGTH_SHORT).show()
                        Log.d("PROGRESS", fileReference.toString())
                    }
                    .addOnFailureListener {
                        Toast.makeText(this@MainActivity, "Deu ruim :(", Toast.LENGTH_SHORT).show()
                    }
                    .addOnProgressListener {
                        Log.d("PROGRESS", it.toString())
                    }
            }
        }
    }

    fun procurarArquivo() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(intent, CONTENT_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CONTENT_REQUEST_CODE && resultCode == RESULT_OK) {
            // CÓDIGO
            imageURI = data?.data
            findViewById<ImageView>(R.id.imgPreview).setImageURI(imageURI)
        }
    }

    companion object {
        const val CONTENT_REQUEST_CODE = 1
    }
}