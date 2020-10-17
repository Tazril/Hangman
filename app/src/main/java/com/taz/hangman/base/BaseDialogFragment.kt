package com.taz.hangman.base

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.firebase.firestore.ListenerRegistration
import timber.log.Timber

abstract class BaseDialogFragment(val layoutId: Int) : DialogFragment() {
    val compositeListener = mutableListOf<ListenerRegistration>()
    val compositeTimer = mutableListOf<CountDownTimer>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isCancelable = false
        initView()
    }

    abstract fun initView()

    override fun onStart() {
        super.onStart()
        setupListeners()
    }

    abstract fun setupListeners()

    override fun onStop() {
        compositeListener.forEach { it.remove() }
        super.onStop()
    }

    override fun onDestroy() {
        compositeTimer.forEach { it.cancel() }
        super.onDestroy()
    }

    override fun show(manager: FragmentManager, tag: String?) {
        try {
            manager.beginTransaction().apply {
                add(this@BaseDialogFragment, tag)
                commitAllowingStateLoss()
            }
        } catch (e: IllegalStateException) {
            Timber.d("Exception: ${e.localizedMessage}")
        }
    }



}