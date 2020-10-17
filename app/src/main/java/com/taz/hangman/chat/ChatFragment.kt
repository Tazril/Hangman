package com.taz.hangman.chat

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.Query
import com.taz.hangman.R
import com.taz.hangman.base.BaseFragment
import com.taz.hangman.chat.view.ChatAdapter
import com.taz.hangman.chat.view.ChatMessage
import com.taz.hangman.local.DataHolder
import com.taz.hangman.pagination.LoadingState
import com.taz.hangman.utils.HangmanDatabase
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.fragment_chat.view.*

class ChatFragment : BaseFragment(R.layout.fragment_chat) {
    companion object {
        val chatCollectionReference = HangmanDatabase.room().collection("chat")
    }

    override fun initView() {
        initAdapter()
        initRecylerView()
        setUpPageAdapter()
        setupSendMessage()
    }

    override fun setupListeners() {

    }



    fun Query.whereAfterDate(): Query =
        whereGreaterThan("id", System.currentTimeMillis().toString())


    lateinit var adapter: ChatAdapter

    private fun initAdapter() {
        val messagesQuery = chatCollectionReference//.orderBy("date", Query.Direction.DESCENDING)
        val newMessagesQuery = messagesQuery.whereAfterDate()
        adapter = ChatAdapter(
            paginationQuery = messagesQuery,
            realTimeQuery = newMessagesQuery,
            lifecycleOwner = this
        )
    }

    private fun initRecylerView() {
        messageListRecyclerView.apply {
            hasFixedSize()
            layoutManager = LinearLayoutManager(context)//, RecyclerView.VERTICAL, true)
        }
        messageListRecyclerView.adapter = adapter
    }


    fun setUpPageAdapter() {
        adapter.loadingState.observe(requireActivity(), Observer {
            if (it != null) {
                handleLoadingState(it)
            }
        })
    }

    private fun handleLoadingState(loadingState: LoadingState) {
        when (loadingState) {
            LoadingState.EMPTY -> renderView(empty = true)
            LoadingState.LOADING_INITIAL -> renderView(loading = true)
            LoadingState.INITIAL_LOADED -> renderView(messages = true)
            LoadingState.LOADING_MORE -> renderView(loading = true, messages = true)
            LoadingState.MORE_LOADED -> renderView(messages = true)
            LoadingState.FINISHED -> renderView(messages = true)
            LoadingState.ERROR -> renderView(error = true)
            LoadingState.NEW_ITEM -> renderView(messages = true, scroll = true)
            LoadingState.DELETED_ITEM -> {
            }
        }
    }

    private fun setupSendMessage() {
        messgaeInputTextLayout.setEndIconOnClickListener {
            val message = messgaeInputTextLayout.messageInputText.text.toString()
            if (message.isEmpty())
                return@setEndIconOnClickListener

            chatCollectionReference
                .document(System.currentTimeMillis().toString())
                .set(
                    ChatMessage(
                        id = System.currentTimeMillis().toString(),
                        text = message,
                        name = DataHolder.name
                    )
                )
            messgaeInputTextLayout.messageInputText.setText("")
        }
    }

    private fun renderView(
        empty: Boolean = false,
        loading: Boolean = false,
        error: Boolean = false,
        messages: Boolean = false,
        scroll: Boolean = false
    ) {
        errorText.toggleVisibility(error)
        progressBar.toggleVisibility(loading)
        messageListRecyclerView.toggleVisibility(messages)

        if (scroll)
            messageListRecyclerView.smoothScrollToPosition(adapter.itemCount - 1)
    }

    private fun View.toggleVisibility(show: Boolean) {
        visibility = if (show) View.VISIBLE else View.GONE
    }


}
