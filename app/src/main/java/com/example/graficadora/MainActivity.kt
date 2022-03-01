package com.example.graficadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.analizador.Lexer
import com.example.analizador.parser
import com.google.android.material.snackbar.Snackbar
import java.io.StringReader
import java.lang.Exception

//import com.example.analizador.parser
lateinit var boton: Button
lateinit var texto: EditText
lateinit var fondo: ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.editTextCaja)
        boton = findViewById(R.id.buttonAnalizar) as Button
        fondo = findViewById(R.id.fondo) as ConstraintLayout

        boton.setOnClickListener{
            accion()
        }
    }

    fun accion(){

        val text = texto.text.toString()
        val reader = StringReader(text)
        val lexer = Lexer(reader)
        val parser = parser(lexer)
        try {
            parser.parse()
        }catch (ex: Exception){
            val mySnackbar = Snackbar.make(fondo, ex.stackTraceToString(), 3000)
            mySnackbar.show()
        }
    }
}