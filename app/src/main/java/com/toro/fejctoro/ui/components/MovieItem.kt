package com.toro.fejctoro.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.toro.fejctoro.ui.models.Movie

@Composable
fun MovieItem(movie: Movie, onClick: () -> Unit) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() }
    ){
        Image(painter = painterResource(id = movie.imageResId),
        contentDescription = movie.name,
        modifier = Modifier
            .size(150.dp, 85.dp)
            .align(Alignment.CenterVertically)
        )
        Column (
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)
        ){
            Text(
                text = movie.name,
                color = Color.Black,
                maxLines = 2,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Release Year: ${movie.releaseYear}",
                fontSize = 14.sp,
                color = Color.Gray
            )
            Text(
                text = "Director: ${movie.director}",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}