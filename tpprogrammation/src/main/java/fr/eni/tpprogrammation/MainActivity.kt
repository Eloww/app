package fr.eni.tpprogrammation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alLangage = arrayListOf<Langage>(
            Langage("PHP", "HAUT", 1994),
            Langage("JAVA", "HAUT", 1995),
            Langage("C", "BAS", 1970),
            Langage("C#", "HAUT", 2001),
            Langage("RUBY", "HAUT", 1995),
        )

        val rvLangage = findViewById<RecyclerView>(R.id.rvProg)
        rvLangage.layoutManager = LinearLayoutManager(this)
        rvLangage.adapter = LangageAdapter(alLangage)
    }
}