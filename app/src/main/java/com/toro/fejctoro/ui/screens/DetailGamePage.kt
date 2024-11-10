package com.toro.fejctoro.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.toro.fejctoro.ui.components.DescDetailText
import com.toro.fejctoro.ui.components.DetailTopAppBar
import com.toro.fejctoro.ui.components.ErrorMsg
import com.toro.fejctoro.ui.components.ReleaseYear
import com.toro.fejctoro.ui.components.TitleDetailText
import com.toro.fejctoro.ui.models.DataGame

@Composable
fun DetailGamePage(navController: NavController, gameId: String){
    Log.d("DetailGamePage", "gameId: $gameId")

    val gameList = DataGame.getGameData()
    val game = gameList.firstOrNull{ it.id == gameId}

    if (game != null) {
        Scaffold (
            topBar = {
                DetailTopAppBar(navController = navController, title = game.name)
            }
        ) { padding ->
            Column (
                modifier = Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .background(Color(color = 0xFFF1F3C2))
                    .fillMaxSize()
                    .padding(20.dp)
                    .padding(padding),
            ){
                Image(
                    painter = painterResource(id = game.imageResId),
                    contentDescription = game.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(20.dp))
                TitleDetailText(title = game.name)

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Developer: ${game.dev}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray
                )

                ReleaseYear(title = "Release Year: ${game.releaseYear}")

                Spacer(modifier = Modifier.height(8.dp))
                DescDetailText(title = game.desc)

            }
        }
    } else {
        Log.e("GameDetailPage", "Game with ID $gameId not found!")
        ErrorMsg(msg = "Data Game not found!")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailGamePagePreview() {
    DetailGamePage(navController = rememberNavController(), gameId = "G1")
}