package com.taz.hangman.fragment

import android.content.Intent
import android.media.MediaPlayer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.taz.hangman.R
import com.taz.hangman.adapter.LobbyListAdapter
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.local.DataHolder
import com.taz.hangman.local.DataHolder.code
import com.taz.hangman.local.DataHolder.userCount
import com.taz.hangman.utils.Constants
import com.taz.hangman.utils.HangmanDatabase
import com.taz.hangman.utils.NetworkHelper
import com.taz.hangman.widgets.ProgressDisplay.showProgress
import kotlinx.android.synthetic.main.fragment_lobby.*
import timber.log.Timber

class LobbyFragment : BaseFragment(R.layout.fragment_lobby) {

    companion object {
        const val TAG = "LobbyFragment"
    }

    val lobbyListAdapter = LobbyListAdapter()
    var responseCount = 0

    override fun setupListeners() {


        HangmanDatabase.responseCountPath.addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            responseCount = it?.getLong(Constants.VALUE)?.toInt() ?: 0
            Timber.d("responseCount $responseCount")
            updateText()
        }.let { compositeListener.add(it) }

        HangmanDatabase.triggerPath.addSnapshotListener { it, e ->
            e?.let { return@addSnapshotListener }
            it?:return@addSnapshotListener
            //Do not save here
            val turn = it.getString(Constants.TURN)?:""
//            DataHolder.word = it.getString(Constants.WORD)?:""
            if(turn!="")
                findNavController().navigate(R.id.action_lobbyFragment_to_waitRoomFragment)
        }.let { compositeListener.add(it) }

    }

    override fun initView() {
        codeText.text = getString(R.string.game_code, code)
        DataHolder.turn = Constants.UNINITIALISED

        shareButton.setOnClickListener {
            val link = "https://play.hangman.with.code/$code"
            val message = "Join Hangman room using $code \nIf Hangman is installed click here: $link"
            val sendInviteIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, message)
                type = "text/plain"
            }
            startActivity(Intent.createChooser(sendInviteIntent, "Invite a friend via..."))
        }

        recyclerView.apply {
            hasFixedSize()
            adapter = lobbyListAdapter
            layoutManager = GridLayoutManager(requireContext(), 4)
        }

        startButton.setOnClickListener {
            if (!isReady) NetworkHelper.incrementResponseCount()
            else NetworkHelper.decrementResponseCount()
            isReady = !isReady
        }

    }

    fun updateText() {
        statusText.text = getString(
            R.string.players_joined,
            userCount,
            DataHolder.maxUserCount
        )
        startButton.text = getString(
            R.string.start,
            (if (isReady) "Not" else ""),
            responseCount,
            userCount
        )
    }

    var isReady = false

    private lateinit var mediaPlayer: MediaPlayer

    override fun onStart() {
        super.onStart()
        playMusic()
    }

    override fun onStop() {
        super.onStop()
        stopMusic()
    }

    fun playMusic() {
        if (!DataHolder.isSilent)
            mediaPlayer = MediaPlayer.create(requireContext(), R.raw.game_loop).apply {
                isLooping = true
            }.apply { start() }
    }

    fun stopMusic() { if(this::mediaPlayer.isInitialized) mediaPlayer.release() }


}
