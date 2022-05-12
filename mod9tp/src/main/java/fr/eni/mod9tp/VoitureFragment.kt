package fr.eni.mod9tp

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import fr.eni.mod9tp.databinding.FragmentVoitureBinding

class VoitureFragment : Fragment() {

    lateinit var fvb: FragmentVoitureBinding
    lateinit var vm: VoitureViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fvb = FragmentVoitureBinding.inflate(inflater)
        return fvb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm = ViewModelProvider(this, ViewModelFactory(requireActivity().application))[VoitureViewModel::class.java]

        vm.voiture.observe(viewLifecycleOwner) {
            fvb.voiture = it
        }

        vm.randomVoiture()
    }
}