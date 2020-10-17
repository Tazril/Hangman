package com.taz.hangman

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.children
import timber.log.Timber
import java.util.*

class GameLogic(
    var word: String,
    wordDisplayLayout: LinearLayout,
    val hangmanDisplayText: TextView
) {

    companion object {
        const val hangman = "HANGMAN"
    }

    private val letterToIndices = mutableMapOf<Char, MutableList<Int>>()
    private val textViewList = mutableListOf<TextView>()
    private var correctLen = 0
    private var wrongLen = 0
    var wordDisplay: CharArray
    fun getWordDisplay() = wordDisplay.joinToString ("")

    init {
        word = word.toUpperCase(Locale.ENGLISH)
        wordDisplay = CharArray(word.length) {'_'}
        Timber.d("wordDisplay Init ${getWordDisplay()}")
        for (index in (0..(word.length - 1))) {
            if (letterToIndices[word[index]] == null)
                letterToIndices.put(word[index], mutableListOf(index))
            else letterToIndices[word[index]]?.add(index)
        }
        var childCount = 0
        for (childView in wordDisplayLayout.children) {
            if (childView is TextView) {
                if (childCount < word.length) {
                    childView.visibility = View.VISIBLE
                    textViewList.add(childView)
                } else childView.visibility = View.GONE
                childCount++
            }
        }

    }

    /**
     * [param]
     */
    fun score(timeLeft: Float) =
        ((timeLeft / 60f) * (correctLen.toFloat() / word.length.toFloat()) * 1000).toInt()

    fun event(letter: Char): STATUS =
        if (word.contains(letter)) correctAnswer(letter) else wrongAnswer()

    fun wrongAnswer(): STATUS {
        wrongLen++

        val spannable: Spannable = SpannableString(hangman).apply {
            setSpan(
                ForegroundColorSpan(Color.RED),
                0,
                wrongLen,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        hangmanDisplayText.setText(spannable, TextView.BufferType.SPANNABLE)

        if (wrongLen == hangman.length) {

            return STATUS.LOST
        }
        return STATUS.IN_PROGRESS
    }

    fun correctAnswer(letter: Char): STATUS {
        Timber.d("letter $letter ")
        letterToIndices[letter]?.let { indexList ->
            Timber.d(" indexList $indexList")
            for (index in indexList) {
                textViewList[index].text = letter.toString()
                wordDisplay[index] = letter

            }
            correctLen += indexList.size
            if (correctLen == word.length) {
                return STATUS.WON
            }

        }
        Timber.d("wordDisplay ${getWordDisplay()} ")
        return STATUS.IN_PROGRESS
    }

    enum class STATUS {
        WON, LOST, IN_PROGRESS
    }

}