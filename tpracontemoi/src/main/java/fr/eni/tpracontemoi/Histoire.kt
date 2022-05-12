package fr.eni.tpracontemoi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Histoire(
    val prenom: String,
    val lieu: String
): Parcelable
