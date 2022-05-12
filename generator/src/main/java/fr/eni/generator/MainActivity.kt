package fr.eni.generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minimumInput = findViewById<EditText>(R.id.minimum)
        val maximumInput = findViewById<EditText>(R.id.maximum)
        val button = findViewById<Button>(R.id.generate)
        val resultInput = findViewById<TextView>(R.id.result)


        button.setOnClickListener {

            val minimum = minimumInput.text.toString().toInt()
            val maximum = maximumInput.text.toString().toInt()

            resultInput.text = (minimum..maximum).random().toString()
        }


    }
}