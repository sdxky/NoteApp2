package com.example.noteapp2.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.noteapp2.R
import com.example.noteapp2.databinding.FragmentOnBoardBinding
import com.example.noteapp2.ui.adapter.OnBoardAdapter

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListeners()
        dotsChange()
    }

    private fun initialize() {
        binding.viewpager2.adapter = OnBoardAdapter(this)
    }

    private fun setupListeners() = with(binding.viewpager2) {
        registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 2) {
                    binding.tvSkip.visibility = View.GONE
                } else {
                    binding.tvSkip.visibility = View.VISIBLE
                }
            }
        })
        binding.tvSkip.setOnClickListener {
            if (currentItem < 3) {
                setCurrentItem(currentItem + 2, true)
            }
        }
    }

    private fun dotsChange() {
        binding.dotsIndicator.attachTo(binding.viewpager2)
    }

}