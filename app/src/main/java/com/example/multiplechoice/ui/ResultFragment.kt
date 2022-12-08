package com.example.multiplechoice.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.multiplechoice.MainViewModel
import com.example.multiplechoice.databinding.ResultFragmentBinding

class ResultFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()

    private lateinit var binding: ResultFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ResultFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.leaveBtn.setOnClickListener {
            activity?.finish()
        }
    }
}