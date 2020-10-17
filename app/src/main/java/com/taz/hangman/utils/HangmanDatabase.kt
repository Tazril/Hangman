package com.taz.hangman.utils

import com.google.firebase.firestore.FirebaseFirestore
import com.taz.hangman.local.DataHolder.code
import com.taz.hangman.local.DataHolder.name
import com.taz.hangman.utils.Constants.EVENT_LIST
import com.taz.hangman.utils.Constants.HINT_LIST
import com.taz.hangman.utils.Constants.ROOM
import com.taz.hangman.utils.Constants.USER_LIST

object HangmanDatabase {

    val db: FirebaseFirestore = FirebaseFirestore.getInstance()

    fun roomPath() = db.collection(ROOM)
    fun userPath(code: String) = roomPath().document(code).collection(USER_LIST)
    fun room() = roomPath().document(code.toString())
    fun userPath() = room().collection(USER_LIST)
    fun user() = room().collection(USER_LIST).document(if (name == "") "#" else name)
    fun eventPath() = room().collection(EVENT_LIST)
    val hintsPath = eventPath().document(Constants.HINT_LIST)
    val responseCountPath = eventPath().document(Constants.RESPONSE_COUNT)
    val triggerPath = eventPath().document(Constants.TRIGGER)


}

