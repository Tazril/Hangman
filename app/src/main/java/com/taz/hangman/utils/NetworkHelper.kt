package com.taz.hangman.utils

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.WriteBatch
import com.taz.hangman.local.DataHolder.maxUserCount
import com.taz.hangman.local.DataHolder.name
import com.taz.hangman.model.Room

object NetworkHelper {

    fun scoreIncrementer(score: Int) =
        HangmanDatabase.user().update(Constants.SCORE, FieldValue.increment(score.toLong()))

    fun clearScore() = HangmanDatabase.userPath().document(name).update(Constants.SCORE, 0)

    fun setUser() = HangmanDatabase.userPath().document(name).set(mapOf("score" to 0))

    fun initRoom(): Task<Void> {
        val batch: WriteBatch = HangmanDatabase.db.batch()
        batch.set(
            HangmanDatabase.room(),
            Room(
                maxUserCount = maxUserCount,
                timeStamp = System.currentTimeMillis()
            )
        )
        batch.set(
            HangmanDatabase.userPath().document(name),
            mapOf(
                Constants.SCORE to 0,
                Constants.INC_SCORE to -1,
                Constants.WORD_DISPLAY to ""
            )
        )
        batch.set(HangmanDatabase.responseCountPath, mapOf("value" to 0))
        batch.set(HangmanDatabase.hintsPath, mapOf("value" to listOf<String>()))
        batch.set(HangmanDatabase.triggerPath, mapOf("turn" to "", "word" to ""))
        batch.set(
            HangmanDatabase.eventPath().document("turnIdx"), mapOf("value" to -1)
        )
        return batch.commit()

    }


    fun setWord(word: String) = HangmanDatabase.triggerPath.update(Constants.WORD, word)

    fun setHint(hint: String) =
        HangmanDatabase.hintsPath.update(Constants.VALUE, FieldValue.arrayUnion(hint))


    fun incrementResponseCount() =
        HangmanDatabase.responseCountPath.update(Constants.VALUE, FieldValue.increment(1))

    fun decrementResponseCount() =
        HangmanDatabase.responseCountPath.update(Constants.VALUE, FieldValue.increment(-1))


    fun removeUser() = HangmanDatabase.user().delete()

    fun updatePlayerStatus(wordDisplay: String, score: Int) {
        HangmanDatabase.user().set(
            mapOf(
                Constants.INC_SCORE to score,
                Constants.WORD_DISPLAY to wordDisplay
            ), SetOptions.merge()
        )
    }

}