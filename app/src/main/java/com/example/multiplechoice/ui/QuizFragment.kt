package com.example.multiplechoice.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.multiplechoice.MainViewModel
import com.example.multiplechoice.R
import com.example.multiplechoice.databinding.QuizFragmentBinding

class QuizFragment : Fragment(){
    lateinit var binding : QuizFragmentBinding

    private val viewmodel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = QuizFragmentBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.a.setOnClickListener {
            viewmodel.checkAnswer(1)
        }
        binding.b.setOnClickListener {
            viewmodel.checkAnswer(2)
        }
        binding.c.setOnClickListener {
            viewmodel.checkAnswer(3)
        }
        binding.d.setOnClickListener {
            viewmodel.checkAnswer(4)
        }


        viewmodel.question.observe(
            viewLifecycleOwner,
            Observer {
                Log.d("QuizFragment", "LiveData fired!!")
                binding.questionText.text = it.question
                binding.aAnswer.text = it.answerOne
                binding.answerB.text = it.answerTwo
                binding.answerC.text = it.answerThree
                binding.answerD.text = it.answerFour
            }
        )

        viewmodel.gameEnd.observe(
            viewLifecycleOwner,
            Observer {
                if (it == true) {
                    findNavController()
                        .navigate(QuizFragmentDirections.actionQuizFragmentToResultFragment())
                }
            }
        )

        }
    }
