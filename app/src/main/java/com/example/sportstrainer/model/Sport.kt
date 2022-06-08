package com.example.sportstrainer.model

data class Sport (
    val id: Int,
    val name: String,
    val imageResourceId: Int,
    val skills: List<Skill>,
)