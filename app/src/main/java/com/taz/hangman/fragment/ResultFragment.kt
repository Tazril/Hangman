package com.taz.hangman.fragment

import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.taz.hangman.adapter.LeaderListAdapter
import com.taz.hangman.R
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.local.DataHolder
import com.taz.hangman.local.DataHolder.userCount
import com.taz.hangman.model.Player
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.utils.SoundPlayer
import com.taz.hangman.widgets.ProgressDisplay.showProgress
import kotlinx.android.synthetic.main.fragment_lobby.*
import kotlinx.android.synthetic.main.fragment_result.*
import kotlinx.android.synthetic.main.fragment_result.recyclerView
import timber.log.Timber

class ResultFragment : BaseFragment(R.layout.fragment_result) {

    override fun initView() {
        recyclerView.apply {
            hasFixedSize()
            adapter = leaderListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        configureRestart()

        SoundPlayer.getInstance().apply {playSound(endSound)}
    }

    private var responseCount: Int = 0
    val leaderListAdapter = LeaderListAdapter()
    override fun setupListeners() {
        HangmanDatabase.userPath().addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            it ?: return@addSnapshotListener
            val scoreList =
                it.documents.map { doc ->
                    doc.toObject(Player::class.java)?.also { it.name = doc.id }
                        ?: return@addSnapshotListener
                }

            leaderListAdapter.list = scoreList.sortedBy { -it.score }
            leaderListAdapter.notifyDataSetChanged()
        }.let { compositeListener.add(it) }

        HangmanDatabase.responseCountPath.addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            responseCount = it?.getLong(Constants.VALUE)?.toInt() ?: 0
            restartButton.text =
                getString(R.string.restart, (if (isReady) "Undo" else ""), responseCount, userCount)
            Timber.d("responseCount $responseCount")
        }.let { compositeListener.add(it) }

        HangmanDatabase.triggerPath.addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            it?:return@addSnapshotListener
            DataHolder.turn = it.getString(Constants.TURN)?:""
            if(DataHolder.turn=="") {
                NetworkHelper.clearScore()
                findNavController().navigate(R.id.action_resultFragment_to_lobbyFragment)
            }
        }.let { compositeListener.add(it) }
    }

    var isReady = false
    private fun configureRestart() {
        restartButton.text =
            getString(R.string.restart, (if (isReady) "Undo" else ""), responseCount, userCount)
        restartButton.setOnClickListener {
            if (!isReady) NetworkHelper.incrementResponseCount()
            else NetworkHelper.decrementResponseCount()
            isReady = !isReady
        }
    }

}
