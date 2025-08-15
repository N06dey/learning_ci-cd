package com.example.basics_ci.ui.viewModels

import androidx.lifecycle.ViewModel
import com.example.basics_ci.ui.di.TimeProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(private val timeProvider: TimeProvider): ViewModel() {

    private val _x = MutableStateFlow(0)
    val ans: StateFlow<Int> = _x.asStateFlow()

    fun inc(){
        _x.update { it+1 }
    }

    fun reset(){
        _x.value = 0
    }
}