package com.example.francisco.myapplication6

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.jetbrains.anko.toast
import org.jetbrains.anko.*;
import kotlinx.android.synthetic.main.activity_calculo_juros.*


class CalculoJuros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_juros)
        //Context.toast("Hello world!")
        //Toast.makeText(this, R.id.dtPagamento."Button 1",
        //Toast.LENGTH_LONG).show();


    }

    fun Calcular(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        //val myToast = Toast.makeText(this, "Calculando...", Toast.LENGTH_SHORT)
        val obj=findViewById<EditText>(R.id.vlrPagar)
        Toast.makeText(this,obj.text, Toast.LENGTH_LONG).show()
        val myToast = Toast.makeText(this, "Calculando...", Toast.LENGTH_SHORT)
        myToast.show()
        //Contextx("Hello world!")


        fun Contextx(message: CharSequence) =
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        fun countMe(view: View) {
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


    //class MainActivityUI : AnkoComponent<> {
    //    override fun createView(ui: AnkoContext<>) = with(ui) {
    //        verticalLayout {
    //            val name = vlrPagar()
    //            button("Say Hello") {
    //                onClick { ctx.toast("Hello, ${name.text}!") }
    //            }
    //        }
    //    }
    //}
}