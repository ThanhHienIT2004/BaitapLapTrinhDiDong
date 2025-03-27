package com.example.baitaplaptrinhdidong.screens.week4.w4_2

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.viewmodel.TaskViewModel
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.EmptyTaskHome
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.HeaderHome
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.TaskItem

@Composable
fun TaskListScreen(navController: NavController, viewModel: TaskViewModel = viewModel()) {
    val tasks = viewModel.tasks.collectAsState().value

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        HeaderHome()
        Spacer(modifier = Modifier.height(16.dp))

        if (tasks.isEmpty()) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                EmptyTaskHome()
            }
        } else {
            LazyColumn {
                items(tasks) { task ->
                    TaskItem(task)
                }
            }
        }
    }
}
