package com.example.sportstrainer.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.sportstrainer.data.SkillsDataSource
import com.example.sportstrainer.model.Skill
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SkillsViewModel : ViewModel(){
    private val skillsData = SkillsDataSource.hockeySkills

    private var _currentSkill = MutableStateFlow(skillsData[0])
    val currentSkill: StateFlow<Skill> = _currentSkill

    fun updateCurrentSkill(skill: Skill) {
        _currentSkill.value = skill
        Log.d("skillViewModel", "current skill in viewmodel updated to: ${skill.name}")
    }
}
