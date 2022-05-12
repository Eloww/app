package fr.eni.modsafeargs

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val email: String,
    val nom: String,
    val prenom: String
): Parcelable