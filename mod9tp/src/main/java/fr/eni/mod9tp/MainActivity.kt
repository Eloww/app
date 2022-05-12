package fr.eni.mod9tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import fr.eni.mod9tp.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var vm: VoitureViewModel
    lateinit var amb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // thread {
        //     val dao = ConcessionnaireDb.getInstance(this).voitureDao()
        //     dao.insert(Voiture(marque = "yuytu", modele = "regtrgt", categorie = Categorie.BERLINE, energie = Energie.ESSENCE, km = 500000, prix = 1500000f))
        //     dao.insert(Voiture(marque = "fryutry", modele = "jytujytuyt", categorie = Categorie.BREAK, energie = Energie.DIESEL, km = 5000, prix = 25000f))
        //     dao.insert(Voiture(marque = "gyhtytry", modele = "regtrgt", categorie = Categorie.PICKUP, energie = Energie.ELECTRECITE, km = 353635, prix = 65786876585f))
        // }
    }
}