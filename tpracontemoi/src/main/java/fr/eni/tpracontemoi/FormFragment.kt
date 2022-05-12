package fr.eni.tpracontemoi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.eni.tpracontemoi.databinding.FragmentFormBinding

class FormFragment : Fragment() {
    lateinit var ffb: FragmentFormBinding
    lateinit var vm

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ffb = FragmentFormBinding.inflate(inflater)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.buttonForm.setOnClickListener {
            val histoire = Histoire(
                ffb.editTextPrenom.text.toString(),
                ffb.editTextLieu.text.toString(),
            )

            val action = FormFragmentDirections.formToHome(histoire)
            Navigation.findNavController(it).navigate(action)
        }
    }
}