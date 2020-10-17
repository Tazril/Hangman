package com.taz.hangman.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.taz.hangman.R
import timber.log.Timber

class AlphaKeyboard(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {

    companion object {
        const val ALL_LETTERS = "QWERTYUIOPASDFGHJKLZXCVBNM"
    }

    init {
        loadAttributes(attrs)
        loadLayout()
    }

    lateinit var root: View
    var onLetterPressed: ((Char) -> Unit)? = null
    private val disabledLetters = hashSetOf<Char>()

    private fun loadAttributes(attributeSet: AttributeSet?) {
        attributeSet?.let {
        }
    }


    private fun loadLayout() {
        root = LayoutInflater.from(context).inflate(R.layout.layout_keyboard, this, true)
        for (c in ALL_LETTERS) {
            val resourceId =
                context.resources.getIdentifier(c.toString(), "id", context.packageName)
            Timber.d("char is ${c}")
            root.findViewById<TextView>(resourceId)
                .setOnClickListener { onLetterViewClick(it as TextView) }
        }
    }


    private fun onLetterViewClick(v: TextView) {
        Timber.d("View Clicked ${v}")
        val letter = v.text.toString().first()
        if (!(letter in disabledLetters)) {
            Timber.d("View Bg white $letter ${letter in disabledLetters}")
            v.background =
                ContextCompat.getDrawable(context,
                    R.drawable.rounded_grey_background
                )
            onLetterPressed?.invoke(letter)
            disabledLetters.add(letter)
        }
    }

    fun disableAll() {
        for (c in ALL_LETTERS) {
            val resourceId =
                context.resources.getIdentifier(c.toString(), "id", context.packageName)
            root.findViewById<TextView>(resourceId).background =
                ContextCompat.getDrawable(context,
                    R.drawable.rounded_grey_background
                )
        }
    }
}