package com.example.baitaplaptrinhdidong.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaseScreen(
    title: String = "",
    showBackButton: Boolean = false,
    onBackClick: (() -> Unit)? = null,
    actionsTop: @Composable (RowScope.() -> Unit) = {},
    actionsBot: @Composable (RowScope.() -> Unit)? = null,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(title, modifier = Modifier.fillMaxWidth().wrapContentWidth()) },
                navigationIcon = {
                    if (showBackButton) {
                        IconButton(onClick = { onBackClick?.invoke()}, Modifier.padding(10.dp)) {
                            Icon( imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
                        }
                    }
                },
                actions = actionsTop
            )
        },
        bottomBar = {
            actionsBot?.let {
                BottomAppBar () { it() }
            }
        }
    ) { padding ->
        Box(modifier = Modifier.fillMaxSize()) {
            content(padding)
        }
    }
}