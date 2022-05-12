package fr.eni.mod8viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import fr.eni.mod8viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    lateinit var vm: CompteurViewModel
    // var compteur = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this)[CompteurViewModel::class.java]
        showCompteur()
        amb.floatingActionButton.setOnClickListener {
            vm.plusUn()
            showCompteur()
        }
    }

    //override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //    outState.putInt("compteur", compteur)
    //}
//
    //override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    //    super.onRestoreInstanceState(savedInstanceState)
    //    compteur = savedInstanceState.getInt("compteur")
    //    showCompteur()
    //}
//
    fun showCompteur() {
        amb.textViewCompteur.text = vm.compteur.toString()
    }
}