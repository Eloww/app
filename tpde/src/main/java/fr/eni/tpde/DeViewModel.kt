package fr.eni.tpde

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DeViewModel : ViewModel() {
    var de = MutableLiveData(0)

    fun random() {
        de.value = (1..6).random()
    }
}