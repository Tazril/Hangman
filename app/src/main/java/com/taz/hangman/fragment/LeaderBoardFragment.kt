package com.taz.hangman.fragment

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.taz.hangman.R
import com.taz.hangman.adapter.LeaderListAdapter
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.local.DataHolder
import com.taz.hangman.model.Player
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.widgets.ProgressDisplay.showProgress
import kotlinx.android.synthetic.main.fragment_leaderboard.*
import timber.log.Timber

class LeaderBoardFragment : BaseFragment(R.layout.fragment_leaderboard) {

    override fun initView() {
        recyclerView.apply {
            hasFixedSize()
            adapter = leaderListAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        shareButton.setOnClickListener {
            val message = "Join Hangman game using ${DataHolder.code}"
            val sendInviteIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, message)
                type = "text/plain"
            }
            startActivity(Intent.createChooser(sendInviteIntent, "Invite a friend via..."))
        }

        exitButton.setOnClickListener {
            val hud = requireContext().showProgress("Exiting Room").apply { show() }
            NetworkHelper.removeUser()
                .addOnCompleteListener { requireActivity().finish(); hud.dismiss() }
        }

    }

    val leaderListAdapter = LeaderListAdapter()
    override fun setupListeners() {
        HangmanDatabase.userPath().addSnapshotListener { v, e ->
            e?.let { return@addSnapshotListener }
            v ?: return@addSnapshotListener
            DataHolder.userCount = v.documents.size
            val scoreList =
                v.documents.map { doc ->
                    doc.toObject(Player::class.java)?.also { it.name = doc.id }
                        ?: return@addSnapshotListener
                }
            requireActivity().supportFragmentManager.findFragmentById(R.id.fragmentHostMain)
                ?.childFragmentManager?.fragments?.get(0)
                ?.also {
                    if (it is PlayOtherFragment) {
                        Timber.d("scoreList $scoreList")
                        scoreList.forEach {
                            if(it.name!=DataHolder.name)
                            it.wordDisplay = it.wordDisplay.replace("[A-Za-z]".toRegex(), "*")
                        }
                        Timber.d("scoreList new $scoreList")
                    } else if (it is PlayMineFragment) {
                        val winLostList =
                            scoreList.filter { it.incScore != -1 || it.name == DataHolder.name }
                        val winList = winLostList.filter { !it.wordDisplay.contains('_') }
                        it.correctAnsCount = winList.size
                        it.wrongAnsCount = winLostList.size - winList.size
                        if(!winList.isEmpty())
                             it.status(winList.map { it.name })
                    } else if (it is LobbyFragment) {
                        it.lobbyListAdapter.apply {
                            list = v.documents.map { it.id }
                            notifyDataSetChanged()
                        }
                        it.updateText()
                    } else {
                        Timber.d(it.javaClass.name)
                    }
                }

            leaderListAdapter.list = scoreList.sortedBy { -it.score }
            leaderListAdapter.notifyDataSetChanged()
        }.let { compositeListener.add(it) }

    }


}
