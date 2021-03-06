package fr.eni.colorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.eni.colorme.databinding.FragmentPinkBinding

class PinkFragment : Fragment() {
    lateinit var fpb: FragmentPinkBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fpb = FragmentPinkBinding.inflate(inflater)
        return fpb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fpb.buttonValiderPink.setOnClickListener {
            val random = (1..3).random()
            if (random > 1) {
                Navigation.findNavController(view).navigate(R.id.pinkToYellow)
            } else {
                Navigation.findNavController(view).navigate(R.id.pinkToGreen
                )
            }
        }
    }
}