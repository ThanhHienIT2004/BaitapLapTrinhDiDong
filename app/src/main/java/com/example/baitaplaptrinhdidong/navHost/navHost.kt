package com.example.baitaplaptrinhdidong.navHost

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baitap.screens.MainScreen
import com.example.baitap.screens.Week1
import com.example.baitap.screens.Week2
import com.example.baitaplaptrinhdidong.screens.Week3
import com.example.baitaplaptrinhdidong.screens.components.W2_Exercise1
import com.example.baitaplaptrinhdidong.screens.components.W2_Exercise2
import com.example.baitaplaptrinhdidong.screens.components.W3_Ex1_Page1
import com.example.baitaplaptrinhdidong.screens.components.W3_Ex1_Page2
import com.example.baitaplaptrinhdidong.screens.components.W3_Ex2_Page1
import com.example.baitaplaptrinhdidong.screens.components.W3_Ex2_Page2
import com.example.baitaplaptrinhdidong.screens.components.W3_Ex2_Page3
import com.example.baitaplaptrinhdidong.screens.components.W3_Exercise1
import com.example.baitaplaptrinhdidong.screens.components.W3_Exercise2

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { MainScreen(navController) }
        // Tuàn 1
        composable("week_1") { Week1(navController) }
        // Tuần 2
        composable("week_2") { Week2(navController) }
            // Ex1
            composable("w2_exercise_1") { W2_Exercise1(navController) }
            // Ex2
            composable("w2_exercise_2") { W2_Exercise2(navController) }
        // Tuần 3
        composable("week_3") { Week3(navController) }
            // Ex1
            composable("w3_exercise_1") { W3_Exercise1(navController) }
                composable("w3_ex1_page_1") { W3_Ex1_Page1(navController) }
                composable("w3_ex1_page_2") { W3_Ex1_Page2(navController) }
            // Ex2
            composable("w3_exercise_2") { W3_Exercise2(navController) }
                composable("w3_ex2_page_1") { W3_Ex2_Page1(navController) }
                composable("w3_ex2_page_2") { W3_Ex2_Page2(navController) }
                composable("w3_ex2_page_3") { W3_Ex2_Page3(navController) }
        // Tuần 4
    }
}