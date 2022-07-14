package com.example.sportstrainer.data

import com.example.sportstrainer.model.Skill

object SkillsDataSource {
    val hockeySkateSkill: List<Skill> = listOf(
        Skill(1, "Skating", WorkoutsDataSource.hockeySkateWorkout),
        Skill(2, "Stick handling", WorkoutsDataSource.hockeyArmWorkout),
    )
}