package com.taz.hangman.model

data class Player(
    var name: String = "",
    val score: Int = 0,
    val incScore: Int = -1,
    var wordDisplay: String = ""
)