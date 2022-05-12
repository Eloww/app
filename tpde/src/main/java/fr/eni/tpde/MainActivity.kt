package fr.eni.tpde

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import fr.eni.tpde.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var amb: ActivityMainBinding
    lateinit var vm: DeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this, R.layout.activity_main)
        vm = ViewModelProvider(this)[DeViewModel::class.java]

        vm.de.observe(this) {
            showDeValue()
        }

        showDeValue()
        amb.floatingActionButton.setOnClickListener {
            vm.random()
        }
    }

    fun showDeValue() {
        when (vm.de.value) {
            1 -> amb.imageView.setImageResource(R.drawable.valeur_une)
            2 -> amb.imageView.setImageResource(R.drawable.valeur_deux)
            3 -> amb.imageView.setImageResource(R.drawable.valeur_trois)
            4 -> amb.imageView.setImageResource(R.drawable.valeur_quatre)
            5 -> amb.imageView.setImageResource(R.drawable.valeur_cinq)
            6 -> amb.imageView.setImageResource(R.drawable.valeur_six)
        }
    }
}