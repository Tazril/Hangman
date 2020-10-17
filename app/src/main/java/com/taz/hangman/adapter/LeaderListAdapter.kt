package com.taz.hangman.adapter

import android.view.View
import com.taz.hangman.R
import com.taz.hangman.base.BaseRecyclerAdapter
import com.taz.hangman.local.DataHolder
import com.taz.hangman.model.Player
import com.taz.hangman.widgets.ResourceSupplier
import kotlinx.android.synthetic.main.item_leaderboard.view.*

class LeaderListAdapter :
    BaseRecyclerAdapter<Player>(
        R.layout.item_leaderboard
    ) {
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val player = list[position]
        holder.itemView.avatarImage.bind(player.name)
        holder.itemView.nameText.text = player.name
        holder.itemView.rankText.text = (position + 1).toString()
        holder.itemView.scoreText.text = player.score.toString()
        (if (player.name.equals(DataHolder.name)) R.drawable.rounded_grey_background
        else R.drawable.rounded_white_background).let {
//            holder.itemView.indicatorText.text = it
            holder.itemView.cardContainer.background =
                ResourceSupplier.getInstance().getDrawable(it)

        }
        if (player.wordDisplay != "") {
//            if(turn!=name) player.wordDisplay.replace("[A-Za-z]","*")
            holder.itemView.line.visibility = View.VISIBLE
            holder.itemView.wordStatusLayout.visibility = View.VISIBLE
            holder.itemView.wordStatusLayout.wordText.text = player.wordDisplay
            holder.itemView.wordStatusLayout.scoreIncText.text =
                if (player.incScore in 0..1000) ResourceSupplier.getInstance()
                    .context.getString(R.string.score_points_increment, player.incScore) else ""
            holder.itemView.wordStatusLayout.scoreIncText.setTextColor(
                ResourceSupplier.getInstance()
                    .getColor(
                        if (player.wordDisplay.contains('_'))
                            R.color.app_red else R.color.app_green
                    )
            )
        } else {
            holder.itemView.line.visibility = View.GONE
            holder.itemView.wordStatusLayout.visibility = View.GONE
        }

    }

}