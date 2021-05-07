package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operacion: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Uno.setOnClickListener { numeroPresionado("1")}
        Dos.setOnClickListener { numeroPresionado("2")}
        Tres.setOnClickListener { numeroPresionado("3")}
        Cuatro.setOnClickListener { numeroPresionado("4")}
        Cinco.setOnClickListener { numeroPresionado("5")}
        Seis.setOnClickListener { numeroPresionado("6")}
        Siete.setOnClickListener { numeroPresionado("7")}
        Ocho.setOnClickListener { numeroPresionado("8")}
        Nueve.setOnClickListener { numeroPresionado("9")}
        Cero.setOnClickListener { numeroPresionado("0")}

        Mas.setOnClickListener { operacionPresionada(SUMA)}
        Menos.setOnClickListener { operacionPresionada(RESTA)}
        Multiplicacion.setOnClickListener { operacionPresionada(MULTIPLICACION)}
        Division.setOnClickListener { operacionPresionada(DIVISION)}

        Clear.setOnClickListener {
            num1 = 0.0
            num2 = 0.0
            resultadotextView.text = "0"
            operacion = NO_OPERACION
        }
        Igual.setOnClickListener{
            var resultado = when(operacion){
                SUMA -> num1 + num2
                RESTA -> num1 - num2
                MULTIPLICACION -> num1 * num2
                DIVISION -> num1 / num2
                else -> 0
            }

            resultadotextView.text = resultado.toString()
        }
    }

    private fun numeroPresionado( digito: String){
        if (operacion == NO_OPERACION){

            num1 = resultadotextView.text.toString().toDouble()
        }else {
            num2 = resultadotextView.text.toString().toDouble()
        }
        resultadotextView.text = "${resultadotextView.text}$digito"
    }

    private fun operacionPresionada(operacion: Int){
        this.operacion = operacion

        resultadotextView.text = "0"
    }

    companion object {
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICACION = 3
        const val DIVISION = 4
        const val NO_OPERACION = 0
    }

}