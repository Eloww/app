package fr.eni.mod9tp

import androidx.room.Entity
import androidx.room.PrimaryKey

enum class Categorie {
    BERLINE, BREAK, CITADINE, PICKUP
}

enum class Energie {
    ESSENCE, DIESEL, ELECTRECITE
}

@Entity
data class Voiture(
    @PrimaryKey(autoGenerate = true) val id: Long = 0L,
    val marque: String,
    val modele: String,
    val categorie: Categorie,
    val energie: Energie,
    val km: Int,
    val prix: Float
)