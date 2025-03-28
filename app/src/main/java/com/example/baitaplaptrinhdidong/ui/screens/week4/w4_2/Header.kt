package com.example.baitaplaptrinhdidong.screens.week4.w4_2


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.baitaplaptrinhdidong.R

@Preview(showBackground = true)
@Composable
fun HeaderHome(modifier: Modifier = Modifier, ){
    Row(
        Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 8.dp, end = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(id = R.drawable.w3bai2),
            contentDescription = "Logo UTH",
            Modifier.size(80.dp)
        )

        Column(Modifier.weight(1f).padding(start = 8.dp)) {
            Text(
                text = "SmartTasks",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Blue
            )
            Text(
                text = "A simple and efficient to-do app",
                fontSize = 13.sp,
                color = Blue
            )
        }

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Thông báo",
            Modifier
                .size(36.dp)



        )
    }
}