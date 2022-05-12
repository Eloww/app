package fr.eni.colorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.eni.colorme.databinding.FragmentRedBinding

class RedFragment : Fragment() {
    lateinit var frb: FragmentRedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        frb = FragmentRedBinding.inflate(inflater)
        return frb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frb.buttonValiderRed.setOnClickListener {
            val random = (1..3).random()
            if (random > 1) {
                Navigation.findNavController(view).navigate(R.id.redToOrange)
            } else {
                Navigation.findNavController(view).navigate(R.id.redToBlue)
            }
        }
    }
}