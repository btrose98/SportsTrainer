package com.example.sportstrainer.ui.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(

): ViewModel() {

    private val _stateFlow = MutableStateFlow("This is a test")
    val stateFlow = _stateFlow.asStateFlow()

    fun triggerStateFlow() {
        _stateFlow.value = "StateFlow"
    }

}