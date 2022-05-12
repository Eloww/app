package fr.eni.mod4findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<EditText>(R.id.editText)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val button = findViewById<Button>(R.id.button)

        textView.text = "Hello"
        editText.setText("Comment allez-vous aujourd'hui ?")
        ratingBar.rating = 3.5f

        button.setOnClickListener {
            Thread.sleep(100)
            button.isEnabled = false
            Toast.makeText(this, "Miam miam !!!!!!", Toast.LENGTH_SHORT).show()

            button.isEnabled = true
        }
    }
}