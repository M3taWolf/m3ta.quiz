package com.example.multiplechoice.data

import com.example.multiplechoice.data.model.Question

class QuizRepository {

    fun loadList(): List<Question> {
        return listOf(
            Question(
                "The smallest planet in our system is",
                "1. Saturn",
                "2. Uranus",
                "3. Mercury",
                "4. Neptun",
                3
            ),
            Question(
                "Which NASA-ROVER covered the most distance on Mars?",
                "1. Spirit",
                "2. Opportunity",
                "3. Sojourner",
                "4. Curiosity",
                2
            ),
            Question(
                "Which is the closest planet to the Sun?",
                "1. Earth",
                "2. Mercury",
                "3. Venus",
                "4. Neptune",
                2

                ),
            Question(
                "The point thought to represent the center of a black hole is known as a",
                "1. Singularity",
                "2. Infinitum",
                "3. Quantum",
                "4. Centrality",
                1
            ),
            Question(
                "Where is the asteroid belt located?",
                "1. Between Earth and Venus",
                "2. Between Jupiter and Saturn",
                "3. Between Mars and Jupiter",
                "4. Between Earth and Mars",
                3
            ),
            Question(
                "What was the Name of the first Space Shuttle",
                "1. Enterprise",
                "2. Excelsior",
                "3. Endavour",
                "4. Atlantis",
                1
            ),
            Question(
                "Which one covered the most distance in space?",
                "1. Rosetta",
                "2. Voyager2",
                "3. Voyager1",
                "4. New Horizons",
                3
            ),
            Question(
                "The largest volcano on the solar sytstem is called Olympus Mons. Where is it?",
                "1. Venus",
                "2. Jupiter",
                "3. Mars",
                "4. Earth",
                3
            ),
            Question(
                "What is the Great Red Spot on Jupiter?",
                "1. A lake",
                "2. A crater",
                "3. A volcano",
                "4. A storm",
                4
            ),
            Question(
                "What are comets mostly made of?",
                "1. Poisonous liquid",
                "2. Dirty ice and dust",
                "3. Rusty metal",
                "4. Hot, liquid rock",
                2
            ),
            Question(
                "What is the Sun mainly made of?",
                "1. Gas",
                "2. Liquid lava",
                "3. Molten iron",
                "4. Rock",
                1
            ),
            Question(
                "Which of these best describe the atmosphere of surrounding Venus?",
                "1. Hot and poisonous",
                "2. Cold and snowy",
                "3. Cold and Stormy",
                "4. Bright and sunny",
                1
            ),
            Question(
                "How many Moons does Mars have?",
                "1. 13",
                "2. 1",
                "3. 50",
                "4. 2",
                4
            ),
            Question(
                "Which planet do the moons Oberon and Titania belong to?",
                "1. Earth",
                "2. Jupiter",
                "3. Uranus",
                "4. Venus",
                3
            ),
            Question(
                "What colour is a sunset on Mars?",
                "1. Red",
                "2. Blue",
                "3. Yellow",
                "4. Green",
                2
            )
        )
    }
}