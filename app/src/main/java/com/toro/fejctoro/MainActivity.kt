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
import com.toro.fejctoro.ui.screens.GamePage
import com.toro.fejctoro.ui.screens.MoviePage
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
            MaterialTheme {
                NavHost(navController = navController, startDestination = "Home") {
                    composable("home") { HomeScreen(navController=navController) }
                    composable("moviepage") {MoviePage(navController)}
                    composable("gamepage") {GamePage(navController)}
                    composable("detailgamepage") {DetailGamePage(navController)}
                    composable("detailmoviepage") {DetailMoviePage(navController)}
                    composable("detailmoviepage") {DetailMusicPage(navController)}

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FEJCToroTheme {
        HomeScreen()
    }
}