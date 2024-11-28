package com.example.noteapp2.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.noteapp2.ui.fragment.onBoard.OnBoardPagingFragment
import com.example.noteapp2.ui.fragment.onBoard.OnBoardPagingFragment.Companion.ARG_ONBOARD_POSITION

class OnBoardAdapter(
    fragment: Fragment
) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment = OnBoardPagingFragment().apply {
        arguments = Bundle().apply {
            putInt(ARG_ONBOARD_POSITION, position)
        }
    }
}