package com.taz.hangman.dialogfragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.taz.hangman.R
import com.taz.hangman.adapter.ScoreListAdapter
import com.taz.hangman.base.BaseDialogFragment
import com.taz.hangman.utils.Constants
import com.taz.hangman.local.DataHolder
import com.taz.hangman.model.Player
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import kotlinx.android.synthetic.main.fragment_score_list.*
import timber.log.Timber


class ScoreListDialogFragment : BaseDialogFragment(R.layout.fragment_score_list) {

    companion object {
        const val TAG = "ScoreListDialogFragment"
    }

    val scoreListAdapter = ScoreListAdapter()

    override fun initView() {
        recyclerView.apply {
            hasFixedSize()
            adapter = scoreListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        Timber.d("word ${DataHolder.word} ")
        wordText.text = DataHolder.word

        NetworkHelper.updatePlayerStatus("",-1)
    }

    override fun setupListeners() {
        HangmanDatabase.userPath().addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            it ?: return@addSnapshotListener
            val scoreList =
                it.documents.map { doc ->
                    doc.toObject(Player::class.java)?.also { it.name = doc.id }
                        ?: return@addSnapshotListener
                }
            scoreListAdapter.list = scoreList.sortedBy { -it.score }
            scoreListAdapter.notifyDataSetChanged()
        }.let { compositeListener.add(it) }
    }

}

