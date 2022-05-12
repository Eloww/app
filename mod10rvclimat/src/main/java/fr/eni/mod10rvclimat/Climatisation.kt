package fr.eni.mod10rvclimat

data class Climatisation(
    val marque: String,
    val modele: String,
    val qteGaz: Float,
    val typeCompresseur: String,
    val typeTelecommande: String
)
