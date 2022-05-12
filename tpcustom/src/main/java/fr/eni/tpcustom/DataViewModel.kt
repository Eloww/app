package fr.eni.tpcustom

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class DataViewModel: ViewModel() {
    var value = MutableLiveData(0)
    var maxValue = MutableLiveData(0)

    fun random(NoButton: String) {
        when (NoButton) {
            "button6" -> value.value = (1..6).random()
            "button12" -> value.value = (1..12).random()
            "button16" -> value.value = (1..16).random()
            "button20" -> value.value = (1..20).random()
        }
    }h