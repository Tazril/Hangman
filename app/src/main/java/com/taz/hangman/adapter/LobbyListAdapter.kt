package com.taz.hangman.adapter

import com.taz.hangman.R
import com.taz.hangman.base.BaseRecyclerAdapter
import kotlinx.android.synthetic.main.item_lobby.view.*

class LobbyListAdapter : BaseRecyclerAdapter<String>(
    R.layout.item_lobby
) {
    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val name = list[position]
        holder.itemView.avatarImage.bind(name)
        holder.itemView.nameText.text = name
    }

}