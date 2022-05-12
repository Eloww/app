package fr.eni.modsafeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.eni.modsafeargs.databinding.FragmentFormBinding

class FormFragment : Fragment() {
    lateinit var ffb: FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        ffb = FragmentFormBinding.inflate(inflater)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.button.setOnClickListener {
            val user = User(
                ffb.editTextEmail.text.toString(),
                ffb.editTextPrenom.text.toString(),
                ffb.editTextNom.text.toString()
            )

            val action = FormFragmentDirections.formToHome(user)
            Navigation.findNavController(it).navigate(action)
        }
    }
}