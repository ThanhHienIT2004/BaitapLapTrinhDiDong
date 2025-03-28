package com.example.baitaplaptrinhdidong.screens.week4.w4_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.model.Task
import androidx.compose.material3.Checkbox
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TaskItem(task: Task) {
    var isChecked = remember { mutableStateOf(false) }
    val ColorCardList = listOf(
        Color(0xFFFFF1F1), // Hồng nhạt
        Color(0xFFFFF8E1), // Vàng kem
        Color(0xFFE1F5FE), // Xanh dương pastel
        Color(0xFFE8F5E9), // Xanh lá nhạt
        Color(0xFFFFF3E0), // Cam pastel
        Color(0xFFEDE7F6), // Tím nhạt
        Color(0xFFFCE4EC), // Hồng phấn
        Color(0xFFFFF9C4)  // Vàng nhạt
    )
    val randomColor = remember {ColorCardList.random()}

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(randomColor)
                .padding(16.dp)
        ) {

            Row {
                Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it })
                Column {
                    // Task Name (Title)
                    Text(
                        text = task.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.padding(4.dp))

                    // Task Description
                    Text(
                        text = task.description,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black
                    )
                }
            }

            Spacer(modifier = Modifier.padding(4.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Status: ${task.status}",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)

                )
                Text(
                    text = task.dueDate,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.DarkGray,
                )

            }
        }
    }
}

