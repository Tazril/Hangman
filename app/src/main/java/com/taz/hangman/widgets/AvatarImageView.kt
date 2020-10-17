package com.taz.hangman.widgets

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.text.TextUtils
import android.util.AttributeSet
import android.view.View
import com.taz.hangman.R
import com.taz.hangman.local.DataHolder
import me.fahmisdk6.avatarview.AvatarView
import me.fahmisdk6.avatarview.FontTextView
import me.fahmisdk6.avatarview.rounded.DynamicRoundedImageView
import timber.log.Timber

class AvatarImageView(context: Context?, attrs: AttributeSet?) : AvatarView(context, attrs) {

    private var imgAvatar: DynamicRoundedImageView =
        findViewById<View>(R.id.round_img_avatar) as DynamicRoundedImageView
    private var textAvatar: FontTextView = findViewById<View>(R.id.text_avatar_name) as FontTextView
    private val colors = listOf(
        R.color.md_blue_800,
        R.color.md_green_800,
        R.color.md_red_800
    ).map { resources.getColor(it) }

    fun bind(name: String) {
        if (TextUtils.isEmpty(name)) return
        val value = name.trim()[0].toInt() * (DataHolder.code%10)
        (textAvatar.background as GradientDrawable).setColor(colors[value % 3])
        val nameArray = name.split(" ").toTypedArray()
        var initial = ""
        try {
            if (nameArray.isNotEmpty()) initial += nameArray[0][0]
            if (nameArray.size > 1) initial += nameArray[nameArray.size - 1][0]
        } catch (e:StringIndexOutOfBoundsException) {
            Timber.d("StringIndexOutOfBoundsException $nameArray")}
        textAvatar.text = initial
        imgAvatar.setImageDrawable(null)

    }

}