package fr.eni.tpracontemoi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val hfa = arguments?.let { HomeFragmentArgs.fromBundle(it) }
        val textViewHistoire = view.findViewById<TextView>(R.id.textViewHistoire)
        textViewHistoire.text = "Il était une fois un être nommé ${hfa?.histoire?.prenom} qui vivait dans un(e) ${hfa?.histoire?.lieu}..."
    }
}