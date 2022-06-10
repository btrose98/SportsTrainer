package com.example.sportstrainer.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    private val _stateFlow = MutableStateFlow("This is a test")
    val stateFlow = _stateFlow.asStateFlow()

    fun triggerStateFlow() {
        _stateFlow.value = "StateFlow"
    }

}