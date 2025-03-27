package com.example.baitaplaptrinhdidong.screens.week4.w4_2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.api.RetrofitInstance
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.model.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TaskViewModel : ViewModel() {
    private val _tasks = MutableStateFlow<List<Task>>(emptyList())
    val tasks: StateFlow<List<Task>> = _tasks

    init {
        getTasks()
    }

    private fun getTasks() {
        viewModelScope.launch {
            val response = RetrofitInstance.api.getTasks()
            if (response.isSuccessful) {
                _tasks.value = response.body()?.data ?: emptyList()
            }
        }
    }
}

