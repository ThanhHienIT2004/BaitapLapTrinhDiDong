package com.example.baitap.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
<<<<<<<< HEAD:app/src/main/java/com/example/baitaplaptrinhdidong/ui/screens/base/MainScreen.kt
import com.example.baitaplaptrinhdidong.screens.components.LazyButtonNav
import com.example.baitaplaptrinhdidong.screens.base.BaseScreen
========
import com.example.baitap.screens.components.LazyButtonNav
import com.example.baitaplaptrinhdidong.ui.screens.BaseScreen
>>>>>>>> f0bdc1b421cb2c478a5d57f7fd0ab9146c0a02e1:app/src/main/java/com/example/baitaplaptrinhdidong/ui/screens/MainScreen.kt

@Composable
fun MainScreen(navController: NavController) {
    BaseScreen("Bài tập hàng tuần") { padding ->
        Column (
            modifier = Modifier.padding(padding).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
<<<<<<<< HEAD:app/src/main/java/com/example/baitaplaptrinhdidong/ui/screens/base/MainScreen.kt
            LazyButtonNav(navController, 5, "Tuần", "week")
========
            LazyButtonNav(navController, 4, "Tuần", "week")
>>>>>>>> f0bdc1b421cb2c478a5d57f7fd0ab9146c0a02e1:app/src/main/java/com/example/baitaplaptrinhdidong/ui/screens/MainScreen.kt
        }
    }
}
