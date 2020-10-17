package com.taz.hangman.adapter

import android.graphics.Color
import com.taz.hangman.R
import com.taz.hangman.base.BaseRecyclerAdapter
import com.taz.hangman.local.DataHolder
import com.taz.hangman.model.Player
import kotlinx.android.synthetic.main.item_scoreboard.view.*

class ScoreListAdapter : BaseRecyclerAdapter<Player>(
    R.layout.item_scoreboard
) {
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val response = list[position]
        holder.itemView.rankText.text = (position + 1).toString()
        holder.itemView.titleText.text = response.name
        "${if (response.score >= 0) "+" else "-"} ${Math.abs(response.score)}".let {
            holder.itemView.scoreText.text = it
        }
        if(response.name.equals(DataHolder.name)) {
            holder.itemView.titleText.setTextColor(Color.BLACK)
            holder.itemView.rankText.setTextColor(Color.BLACK)
            holder.itemView.scoreText.setTextColor(Color.BLACK)
        }
        else{
            holder.itemView.titleText.setTextColor(Color.GRAY)
            holder.itemView.rankText.setTextColor(Color.GRAY)
            holder.itemView.scoreText.setTextColor(Color.GRAY)
        }
    }

}