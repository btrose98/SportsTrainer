package com.example.sportstrainer.model

import androidx.annotation.DrawableRes

data class Skill (
    val id: Int,
    val name: String,
    @DrawableRes val imageResourceId: Int,
//    val workouts: List<Workout>,
)