package com.taz.hangman.base

import android.app.Activity
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.AppCompatEditText
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.firestore.ListenerRegistration

abstract class BaseFragment(val layoutId: Int) : Fragment() {
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

    override fun onDestroyView() {
        compositeTimer.forEach { it.cancel() }
        super.onDestroyView()
    }

    infix fun TextInputLayout.hasClearErrorOnInputOn(appCompatEditText: AppCompatEditText) {
        appCompatEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                this@hasClearErrorOnInputOn.error = ""
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }

    fun hideKeyboard() {
        val imm: InputMethodManager =
            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow((requireActivity().currentFocus ?: View(activity)).windowToken, 0)
    }


    fun resourceId(sid:String) = requireContext().resources.getIdentifier(
        sid, "id", requireContext().packageName
    )



}