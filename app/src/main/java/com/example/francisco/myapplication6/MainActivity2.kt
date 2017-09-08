package com.example.francisco.myapplication6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*
//import kotlinx.android.synthetic.main.activity_second.textview_random
//import kotlinx.android.synthetic.main.activity_second.textview_label

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showRandomNumber()
    }


    fun showRandomNumber() {
        // Get the count from the intent extras
      //  val count = intent.getIntExtra(TOTAL_COUNT, 0)
         val count = 1
        // Generate the random number
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number.
        textview_random.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
         textview_label.text = getString(R.string.random_heading, count)
    }
}
