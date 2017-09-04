package com.example.francisco.myapplication6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculo_juros.*


class CalculoJuros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_juros)



    }
    fun Calcular(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
       val myToast = Toast.makeText(this, "Calculando...", Toast.LENGTH_SHORT)
       myToast.show()


    fun countMe (view: View) {
            // Get the text view
            //val showCountTextView = findViewById(R.id.vlrPagar) as Number
            val showCountTextView = vlrPagar.text.toString()

            // Get the value of the text view.
            val countString = showCountTextView.toString()

            // Convert value to a number and increment it
            var count: Int = Integer.parseInt(countString)
            count++
            //vlrPagar.isShown
            // Display the new value in the text view.
            //vlrPagar = 200
        }

    }
}
