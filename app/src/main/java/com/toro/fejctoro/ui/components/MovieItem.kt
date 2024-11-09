package com.toro.fejctoro.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.toro.fejctoro.ui.models.Movie

@Composable
fun MovieItem(movie: Movie) {
    Column (
        modifier = Modifier
            .width(120.dp)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = movie.imageResId),
            contentDescription = movie.name,
            modifier = Modifier.size(80.dp)
        )
        Text(
            text = movie.name,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}