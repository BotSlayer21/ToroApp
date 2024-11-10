package com.toro.fejctoro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.ui.components.BottomNavBar
import com.toro.fejctoro.ui.components.CustomTopAppBar
import com.toro.fejctoro.ui.components.MovieItem
import com.toro.fejctoro.ui.components.MusicItem
import com.toro.fejctoro.ui.models.DataMovie
import com.toro.fejctoro.ui.models.DataMusic
import com.toro.fejctoro.ui.theme.FEJCToroTheme

@Composable
fun MovieMusicPage(navController: NavController) {
    Scaffold (
        topBar = {
            CustomTopAppBar(navController=navController, title = "Movie & Music")
        },
        bottomBar = {
            BottomNavBar(navController = navController)
        },
        content = { padding ->
            Column (
                modifier = Modifier
                    .background(Color(0xFFF1F3C2))
                    .fillMaxSize()
                    .padding(padding)
            ){
                Text(
                    "My Favorite Music",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E7D32),
                    modifier = Modifier
                        .padding(20.dp)
                        .align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center
                )

                LazyRow (
                    modifier = Modifier
                        .height(165.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(DataMusic.getMusicData()) { music ->
                        MusicItem(music = music) {
                            navController.navigate("detailmusicpage/${music.id}")
                        }
                    }
                }

                Text(
                    text = "My Favorite Movie",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E7D32),
                    modifier = Modifier
                        .padding(20.dp),
                    textAlign = TextAlign.Center
                )

                LazyColumn (
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(DataMovie.getMovieData()) { movie ->
                        MovieItem(movie = movie) {
                            navController.navigate("detailmoviepage/${movie.id}")
                        }
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MovieMusicPagePreview() {
    FEJCToroTheme {
        MovieMusicPage(navController = rememberNavController())
    }
}
