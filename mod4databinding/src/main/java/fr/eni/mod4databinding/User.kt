package fr.eni.mod4databinding

data class User(
    val prenom: String = "John",
    val nom: String = "John",
    var age: Int,
    var villeNaissance: String = "Tatouine",
    var telephone: String = "911",
)
