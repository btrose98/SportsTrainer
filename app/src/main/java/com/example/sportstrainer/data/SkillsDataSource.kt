package com.example.sportstrainer.data

import com.example.sportstrainer.R
import com.example.sportstrainer.model.Skill

object SkillsDataSource {
    val hockeySkills: List<Skill> = listOf(
        Skill(1, "Skating", R.drawable.skating),
        Skill(2, "Stick handling", R.drawable.stickhandle),
    )
}