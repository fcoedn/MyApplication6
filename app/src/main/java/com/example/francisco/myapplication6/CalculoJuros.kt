package com.example.francisco.myapplication6

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.francisco.myapplication6.R.id.vlrPagar
import org.jetbrains.anko.toast
import org.jetbrains.anko.*;
import kotlinx.android.synthetic.main.activity_calculo_juros.*
import java.util.*
import kotlin.system.exitProcess


class CalculoJuros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // dtPagamento.text = "20170508"
        setContentView(R.layout.activity_calculo_juros)
        //Context.toast("Hello world!")
        //Toast.makeText(this, R.id.dtPagamento."Button 1",
        //Toast.LENGTH_LONG).show();

        //val str = findViewById(R.id.text) as EditText
        //val button = findViewById(R.id.btn) as Button
        //result = findViewById(R.id.result) as TextView

            btnCalcular.setOnClickListener {
                var vardtPagamento = findViewById<EditText>(R.id.dtPagamento)
                var vardtVencimento = findViewById<EditText>(R.id.dtVencimento)
                var varvlrPagar = findViewById<EditText>(R.id.vlrPagar)

                if (varvlrPagar.text.toString().length == 0) {
                   Toast.makeText(this,"Dt Pagamento Incorreta", Toast.LENGTH_LONG).show()
                    //return 0
                }
                val myToast1 = Toast.makeText(this, "Calculando123", Toast.LENGTH_SHORT)
                 myToast1.show()
                 //- if (R.id.vlrPagar is Number) {
                 if (isNumeric(R.id.vlrPagar.toString())) {
                    var obj = findViewById<EditText>(R.id.vlrPagar)
                    Toast.makeText(this, obj.text, Toast.LENGTH_LONG).show()
                    var result: Float = obj.text.toString().toFloat()
                    result = result * 2
                    txtPrestacao.text = obj.text
                    txtPrestacao.setText("Prestacao: " +result.toString());
                 } else {
                    txtPrestacao.text = "Prestacao"
                 }
            //- txtPrestacao.text = obj.text
            //this.vlrpagar.text  = Editable.Factory.getInstance().newEditable("")
        }

    }

    fun tela2 (view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, MainActivity2::class.java)

        // Get the current value of the text view.
        val countString = vlrPagar.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
       // randomIntent.putExtra(MainActivity2.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }


    // fun getCurrentTimeStamp(): String {
    //    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US)
    //    val now = Date()
    //    return simpleDateFormat.format(now)
   // }

    fun isNumeric(input: String): Boolean =
            try {
                input.toDouble()
                true
            } catch(e: NumberFormatException) {
                false
            }
    fun Calcular(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        //val myToast = Toast.makeText(this, "Calculando...", Toast.LENGTH_SHORT)
        if (R.id.vlrPagar is Number)  {
            val obj = findViewById<EditText>(R.id.vlrPagar)
            Toast.makeText(this, obj.text, Toast.LENGTH_LONG).show()
        }
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

    companion object {
        const val TOTAL_COUNT = "total_count"
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