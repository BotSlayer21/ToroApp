package com.toro.fejctoro.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleDetailText(title: String) {
    Text(
        text = title,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun DescDetailText(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        color = Color.Black
    )
}

@Composable
fun ReleaseYear(title: String) {
    Spacer(modifier = Modifier.height(5.dp))
    Text(
        text = title,
        fontSize = 16.sp,
        color = Color.Gray,
        fontWeight = FontWeight.Medium,
    )
}

@Composable
fun ErrorMsg(msg: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = msg,
            color = Color.Red
        )
    }
}

@Composable
fun AboutText(title: String) {
    Spacer(modifier = Modifier.height(8.dp))
    Text(
        textAlign = TextAlign.Center,
        text = title,
        color = Color(0xFF2E7D32),
        fontSize = 20.sp,
    )
}