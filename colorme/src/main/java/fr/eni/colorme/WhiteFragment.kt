package fr.eni.colorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.eni.colorme.databinding.FragmentRedBinding
import fr.eni.colorme.databinding.FragmentWhiteBinding

class WhiteFragment : Fragment() {
    lateinit var fwb: FragmentWhiteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fwb = FragmentWhiteBinding.inflate(inflater)
        return fwb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fwb.buttonValider.setOnClickListener {
            val random = (1..3).random()
            if (random > 1) {
                Navigation.findNavController(view).navigate(R.id.whiteToRed)
            } else {
                Navigation.findNavController(view).navigate(R.id.whiteToPink)
            }
        }
    }
}