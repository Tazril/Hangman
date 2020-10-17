package com.taz.hangman.dialogfragment

import com.taz.hangman.R
import com.taz.hangman.adapter.InfoPageAdapter
import com.taz.hangman.base.BaseDialogFragment
import kotlinx.android.synthetic.main.fragment_info.*


class InfoDialogFragment : BaseDialogFragment(R.layout.fragment_info) {

    companion object {
        const val TAG = "InfoDialogFragment"
        val DATA_LIST = listOf<InfoPageAdapter.InfoItem>(
            InfoPageAdapter.InfoItem(
                R.drawable.ic_rules,
                R.string.rules,
                R.string.rules_desc_1,
                R.string.rules_desc_2
            ),
            InfoPageAdapter.InfoItem(
                R.drawable.ic_hint,
                R.string.hints,
                R.string.hint_desc_1,
                R.string.hint_desc_2
            ),
            InfoPageAdapter.InfoItem(
                R.drawable.ic_connected,
                R.string.connected,
                R.string.connected_desc_1,
                R.string.connected_desc_2
            ),
            InfoPageAdapter.InfoItem(
                R.drawable.ic_about_me,
                R.string.about,
                R.string.about_desc_1,
                R.string.about_desc_2
            )
        )
    }


    override fun initView() {
        isCancelable = true
        viewpager.adapter = InfoPageAdapter(requireContext(), DATA_LIST)
        tabLayout.setupWithViewPager(viewpager)
    }

    override fun setupListeners() {

    }

}

