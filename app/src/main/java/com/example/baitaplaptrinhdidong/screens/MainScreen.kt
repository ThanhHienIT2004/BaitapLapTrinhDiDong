package com.example.baitap.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baitap.screens.components.LazyButtonNav
import com.example.baitaplaptrinhdidong.screens.BaseScreen
import com.example.baitaplaptrinhdidong.screens.components.Exercise1_W2
import com.example.baitaplaptrinhdidong.screens.components.Exercise2_W2

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { MainScreen(navController) }
        // Tuàn 1
        composable("week_1") { Week1(navController) }
        // Tuần 2
        composable("week_2") { Week2(navController) }
        composable("exercise_1") { Exercise1_W2(navController) }
        composable("exercise_2") { Exercise2_W2(navController)}
        // Tuần 3
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    BaseScreen("Danh sách bài tập") { padding ->
        Column (
            modifier = Modifier.padding(padding).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyButtonNav(navController, 2, "Tuần", "week")
        }
    }
}
