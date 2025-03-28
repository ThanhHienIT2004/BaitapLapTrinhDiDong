package com.example.baitaplaptrinhdidong.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.baitap.screens.components.LazyButtonNav

@Composable
fun Week4(navController: NavController) {
    BaseScreen(
        "Tuần 4",
        true,
        onBackClick = { navController.popBackStack() }
    ) { padding ->
        Column (
            modifier = Modifier.fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .padding(padding)
        ) {
            LazyButtonNav(navController, 2, "Bài", "w4_exercise")
        }

    }
}