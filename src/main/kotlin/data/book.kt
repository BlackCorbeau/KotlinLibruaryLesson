package org.exampl.data


import java.time.Year

enum class Geners { HORRROR, DETECTIVE, LIFESTORY, FIGHTING}

data class Book(
    val id : Int,
    val title : String,
    val author : String,
    val year : Year,
    val genere: Geners
)