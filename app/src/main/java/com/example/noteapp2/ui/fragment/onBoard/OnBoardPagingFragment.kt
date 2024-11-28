package com.example.noteapp2.ui.fragment.onBoard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.noteapp2.R
import com.example.noteapp2.databinding.FragmentOnBoardPagingBinding

class OnBoardPagingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardPagingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOnBoardPagingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding){
        when (requireArguments().getInt(ARG_ONBOARD_POSITION)) {
            0 -> {
                tvTitle.text = getString(R.string.title1)
                tvDescription.text = getString(R.string.text1)
                lottie.setAnimation(R.raw.lottie1)
            }
            1 -> {
                tvTitle.text = getString(R.string.title2)
                tvDescription.text = getString(R.string.text2)
                lottie.setAnimation(R.raw.lottie2)
            }
            2 -> {
                tvTitle.text = getString(R.string.title3)
                tvDescription.text = getString(R.string.text3)
                lottie.setAnimation(R.raw.lottie3)
            }
        }
    }


    companion object {
        const val ARG_ONBOARD_POSITION = "onBoard"
    }
}