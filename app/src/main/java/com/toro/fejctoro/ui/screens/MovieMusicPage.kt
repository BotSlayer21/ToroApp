package com.toro.fejctoro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import com.toro.fejctoro.ui.components.HomeTopAppBar
import com.toro.fejctoro.ui.components.MovieItem
import com.toro.fejctoro.ui.components.MusicItem
import com.toro.fejctoro.ui.models.DataMovie
import com.toro.fejctoro.ui.models.DataMusic
import com.toro.fejctoro.ui.theme.FEJCToroTheme

@Composable
fun MovieMusicPage(navController: NavController) {
    val searchQuery = remember { mutableStateOf("") }

    val filteredMusic = DataMusic.getMusicData().filter {
        it.name.contains(searchQuery.value, ignoreCase = true)
    }
    val filteredMovies = DataMovie.getMovieData().filter {
        it.name.contains(searchQuery.value, ignoreCase = true)
    }
    Scaffold (
        topBar = {
            HomeTopAppBar(title = "My Favorites Movie & Music")
        },
        bottomBar = {
            BottomNavBar(navController = navController)
        },
        content = { padding ->
            Column (
                modifier = Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .background(Color(0xFFF1F3C2))
                    .fillMaxSize()
                    .padding(top = 60.dp)
            ){
                OutlinedTextField(
                    value = searchQuery.value,
                    onValueChange = { searchQuery.value = it},
                    label = { Text("Search")},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                )

                Text(
                    "Favorite Music",
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
                        .height(160.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(filteredMusic) { music ->
                        MusicItem(music = music) {
                            navController.navigate("detailmusicpage/${music.id}")
                        }
                    }
                }

                Text(
                    text = "Favorite Movie",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2E7D32),
                    modifier = Modifier
                        .padding(10.dp),
                    textAlign = TextAlign.Center
                )

                LazyColumn (
                    modifier = Modifier
                        .padding(bottom = padding.calculateBottomPadding())
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(filteredMovies) { movie ->
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
