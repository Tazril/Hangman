package com.taz.hangman.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.PagerAdapter
import com.taz.hangman.R
import kotlinx.android.synthetic.main.layout_walkthrough.view.*

class InfoPageAdapter(val context: Context,val dataList: List<InfoItem>) : PagerAdapter() {

    data class InfoItem(
        val imageId: Int,
        val titleId: Int,
        val description1Id: Int,
        val description2Id: Int
    )

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val infoItem = dataList[position]
        val layoutInflater = LayoutInflater.from(context)
        val root = layoutInflater.inflate(R.layout.layout_walkthrough, container, false)
        root.image.setImageDrawable(ContextCompat.getDrawable(context, infoItem.imageId))
        root.title.text = context.getString(infoItem.titleId)
        root.description1.text = context.getString(infoItem.description1Id)
        root.description2.text = context.getString(infoItem.description2Id)
        container.addView(root)
        return root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun getCount(): Int = dataList.size

}