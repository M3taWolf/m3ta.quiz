package com.example.multiplechoice.data.model


data class Question(
    val question: String,
    val answerOne: String,
    val answerTwo: String,
    val answerThree: String,
    val answerFour: String,
    val rightAnswer: Int
)