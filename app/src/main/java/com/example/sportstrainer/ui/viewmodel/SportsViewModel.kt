package com.example.sportstrainer.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.sportstrainer.data.SportsDataSource
import com.example.sportstrainer.model.Sport
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SportsViewModel : ViewModel() {

    private val sportsData = SportsDataSource.sports

    private var _currentSport = MutableStateFlow(sportsData[0])
    val currentSport: StateFlow<Sport> = _currentSport

    fun updateCurrentSport(sport: Sport) {
        _currentSport.value = sport
        Log.d("sportsviewmodel", "current sport updated to: ${sport.name}")
    }
}