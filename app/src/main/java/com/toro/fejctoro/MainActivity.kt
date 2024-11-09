package com.toro.fejctoro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.ui.screens.AboutPage
import com.toro.fejctoro.ui.screens.GamePage
import com.toro.fejctoro.ui.screens.MovieMusicPage
import com.toro.fejctoro.ui.screens.HomeScreen
import com.toro.fejctoro.ui.screens.DetailMusicPage
import com.toro.fejctoro.ui.screens.DetailGamePage
import com.toro.fejctoro.ui.screens.DetailMoviePage
import com.toro.fejctoro.ui.theme.FEJCToroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            val navController = rememberNavController()
            FEJCToroTheme {
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { HomeScreen(navController=navController) }
                    composable("moviemusicpage") {MovieMusicPage(navController)}
                    composable("gamepage") {GamePage(navController)}
                    composable("about") {AboutPage(navController)}
                    composable("detailgamepage/{gameId}") { backStackEntry ->
                        val gameId = backStackEntry.arguments?.getString("gameId")
                        DetailGamePage(navController = navController, gameId = gameId?: "")
                    }
                    composable("detailmoviepage/{movieId}") { backStackEntry ->
                        val movieId = backStackEntry.arguments?.getString("movieId")
                        DetailMoviePage(navController = navController, movieId = movieId ?: "")
                    }
                    composable("detailmusicpage/{musicId}") { backStackEntry ->
                        val musicId = backStackEntry.arguments?.getString("musicId")
                        DetailMusicPage(navController = navController, musicId = musicId ?: "")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FEJCToroTheme {
        HomeScreen(navController = rememberNavController())
    }
}