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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
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
import com.toro.fejctoro.ui.models.DataGame

@Composable
fun DetailGamePage(navController: NavController, gameId: String){
    Log.d("DetailGamePage", "gameId: $gameId")

    if (gameId != null) {
        val gameList = DataGame.getGameData()
        val game = gameList.firstOrNull{ it.id == gameId}

        if (game != null) {
            Scaffold (
                topBar = {
                    CustomTopAppBar(navController = navController, title = game.name)
                }
            ) { padding ->
                Column (
                    modifier = Modifier
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
                    DescDetailText(title = game.desc)
                }
            }
        } else {
            Log.e("GameDetailPage", "Game with ID $gameId not found!")
            ErrorMsg(msg = "Data Game not found!")
        }
    } else {
        Log.e("GameDetailPage", "gameId not valid or null")
        ErrorMsg(msg = "Data Game not found!")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailGamePagePreview() {
    DetailGamePage(navController = rememberNavController(), gameId = "G1")
}