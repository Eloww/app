package fr.eni.mod9tp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VoitureViewModel(val voitureDao: VoitureDao, application: Application): AndroidViewModel(application) {
    val voiture = MutableLiveData<Voiture>()

    fun randomVoiture() {
        viewModelScope.launch {
            voiture.value = voitureDao.getById((1..2).random().toLong())
        }
    }
}