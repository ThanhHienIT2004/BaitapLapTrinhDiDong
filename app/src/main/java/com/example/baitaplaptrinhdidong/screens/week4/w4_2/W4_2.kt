package com.example.baitaplaptrinhdidong.screens.week4.w4_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.baitaplaptrinhdidong.R
import com.example.baitaplaptrinhdidong.screens.base.BaseScreenW4_Ex2
import com.example.baitaplaptrinhdidong.screens.week4.w4_2.viewmodel.TaskViewModel
import com.example.baitaplaptrinhdidong.ui.theme.App_APITheme

// -------------------------------- Page 1 -----------------------------------
@Composable
fun W4_2(navController: NavController, taskViewModel: TaskViewModel = viewModel()) {
    App_APITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            TaskListScreen(
                viewModel = taskViewModel,
                navController = navController
            )
        }
    }
}
//
//
//// ✅ CustomBox chỉ hiển thị mô tả
//@Composable
//fun CustomBox2(title: String, description: String, onClick: () -> Unit) {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(vertical = 6.dp, horizontal = 12.dp)
//            .clickable { onClick() }
//            .background(Color(0xFFD2EBFF), shape = RoundedCornerShape(15.dp))
//            .padding(horizontal = 16.dp, vertical = 12.dp)
//    ) {
//        Text(
//            text = title,
//            fontSize = 16.sp,
//            fontWeight = FontWeight.Bold,
//            color = Color.Black
//        )
//        Text(
//            text = description,
//            fontSize = 14.sp,
//            color = Color.Gray
//        )
//    }
//}
//
//@Composable
//fun TaskDetailScreen(navController: NavController, taskId: Int ) {
//    val viewModel: TaskViewModel = viewModel()
//
//    val task = viewModel.selectedTask.observeAsState()
//    LaunchedEffect(taskId) {
//        if (task.value == null) { // Nếu chưa có dữ liệu, gọi API
//            viewModel.getTaskById(taskId)
//        }
//    }
//
//    BaseScreenW4_Ex2(
//        showBackButton = true,
//        onBackClick = { navController.popBackStack() },
//        actionsTop = {
//            Text("Task Detail", fontSize = 24.sp, fontWeight = FontWeight.Bold)
//        }
//    ) { padding ->
//        task.value?.let {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(padding)
//                    .padding(16.dp)
//            ) {
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Text(text = it.title, fontSize = 22.sp, fontWeight = FontWeight.Bold)
//                Text(text = it.description, fontSize = 16.sp, color = Color.Gray)
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Text(text = "Priority: ${it.priority}", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//                Text(text = "Category: ${it.category}", fontSize = 16.sp, fontWeight = FontWeight.Bold)
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Text(text = "Subtasks", fontSize = 18.sp, fontWeight = FontWeight.Bold)
//                it.subtasks.forEach { subtask ->
//                    CustomBox2(
//                        title = subtask.title,
//                        description = "Completed: ${subtask.isCompleted}",
//                        onClick = {}
//                    )
//                }
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Text(text = "Attachments", fontSize = 18.sp, fontWeight = FontWeight.Bold)
//                it.attachments.forEach { attachment ->
//                    CustomBox2(
//                        title = attachment.fileName,
//                        description = "URL: ${attachment.fileUrl}",
//                        onClick = {}
//                    )
//                }
//            }
//        } ?: Text("Loading task...", modifier = Modifier.padding(16.dp))
//    }
//}
