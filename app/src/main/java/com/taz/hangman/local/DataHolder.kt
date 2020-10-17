package com.taz.hangman.local

import kotlin.random.Random

object DataHolder {
    var name: String = "#"
    var word: String = ""
    var turn: String = ""
    var code: Int = 0
    var maxUserCount: Int = 8
    var userCount: Int = 0
    fun setCode() {
        code = Random.nextInt(100000, 1000000)
    }

    var isSilent = false

    fun reset() {
//        if(code!=0)    NetworkHelper.removeUser().addOnCompleteListener {
        name = ""
        word = ""
        turn = ""
        code = 0
        maxUserCount = 8
        userCount = 0
        isSilent = false
//        }
    }

}