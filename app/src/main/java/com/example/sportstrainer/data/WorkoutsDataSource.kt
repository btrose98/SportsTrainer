package com.example.sportstrainer.data

import com.example.sportstrainer.model.Workout

object WorkoutsDataSource {
    val hockeySkateWorkout: List<Workout> = listOf(
        Workout(1, "Squat", "Sit but in the air"),
        Workout(2, "Bulgarian Split Squat", "Lunge but harder"),
        Workout(3, "Walking lunges", "Lunge while walking"),
    )

    val hockeyArmWorkout: List<Workout> = listOf(
        Workout(1, "Curls", "With Dumbells"),
        Workout(2, "Dumbell Rotations", "Rotate dumbells"),
    )
}