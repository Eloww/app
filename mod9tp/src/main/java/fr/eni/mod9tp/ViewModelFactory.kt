package fr.eni.mod9tp

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory(val application: Application): ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VoitureViewModel::class.java)) {
            return VoitureViewModel(
                ConcessionnaireDb.getInstance(application).voitureDao(),
                application
            ) as T
        }

        throw IllegalArgumentException("ViewModel non connu")
    }
}