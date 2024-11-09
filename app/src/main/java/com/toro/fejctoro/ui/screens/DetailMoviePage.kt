package com.toro.fejctoro.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.ui.components.CustomTopAppBar
import com.toro.fejctoro.ui.components.DescDetailText
import com.toro.fejctoro.ui.components.ErrorMsg
import com.toro.fejctoro.ui.components.TitleDetailText
import com.toro.fejctoro.ui.models.DataMovie

@Composable
fun DetailMoviePage(navController: NavController, movieId: String){
    Log.d("DetailMoviePage", "movieId: $movieId")

    if (movieId != null) {
        val movieList = DataMovie.getMovieData()
        val movie = movieList.firstOrNull{ it.id == movieId}

        if (movie != null) {
            Scaffold (
                topBar = {
                    CustomTopAppBar(navController = navController, title = movie.name)
                }
            ) { padding ->
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                        .padding(padding),
                ){
                    Image(
                        painter = painterResource(id = movie.imageResId),
                        contentDescription = movie.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp),
                        contentScale = ContentScale.Fit
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    TitleDetailText(title = movie.name)

                    Spacer(modifier = Modifier.height(8.dp))
                    DescDetailText(title = movie.desc)
                }
            }
        } else {
            Log.e("MovieDetailPage", "Movie with ID $movieId not found!")
            ErrorMsg(msg = "Data Movie not found!")
        }
    } else {
        Log.e("MovieDetailPage", "movieId not valid or null")
        ErrorMsg(msg = "Data Movie not found!")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailMoviePagePreview() {
    DetailMoviePage(navController = rememberNavController(), movieId = "MVE1")
}