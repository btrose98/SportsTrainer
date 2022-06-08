package com.example.sportstrainer.model

data class Skill (
    val id: Int,
    val name: String,
    val workouts: List<Workout>,
)