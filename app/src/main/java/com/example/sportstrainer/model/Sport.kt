package com.example.sportstrainer.model

import androidx.annotation.DrawableRes

data class Sport (
    val id: Int,
    val name: String,
    @DrawableRes val imageResourceId: Int,
    //val skills: List<Skill>,
)