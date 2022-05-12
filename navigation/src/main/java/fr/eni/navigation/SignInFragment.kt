package fr.eni.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.eni.navigation.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    lateinit var fsib: FragmentSignInBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       fsib = FragmentSignInBinding.inflate(inflater)
       return fsib.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fsib.buttonSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.signInToHome)
        )

        // fsib.buttonSignIn.setOnClickListener {
        //    Navigation.findNavController(view).navigate(R.id.signInToHome)
        // }
    }
}