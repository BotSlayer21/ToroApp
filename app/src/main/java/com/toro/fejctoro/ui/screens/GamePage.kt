package com.toro.fejctoro.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
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
import com.toro.fejctoro.ui.components.BottomNavBar
import com.toro.fejctoro.ui.components.HomeTopAppBar
import com.toro.fejctoro.ui.models.DataGame
import com.toro.fejctoro.ui.theme.FEJCToroTheme

@Composable
fun GamePage(navController: NavController){
    val searchQuery = remember { mutableStateOf("") }

    val filteredGames = DataGame.getGameData().filter {
        it.name.contains(searchQuery.value, ignoreCase = true)
    }
    Scaffold (
        topBar = {
            HomeTopAppBar(title = "My Favorite Games")
        },
        bottomBar = {
            BottomNavBar(navController = navController)
        },
        content = { padding ->
            Column (
                modifier = Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .fillMaxSize()
                    .background(Color(0xFFF1F3C2))
                    .padding(top = 60.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                OutlinedTextField(
                    value = searchQuery.value,
                    onValueChange = { searchQuery.value = it},
                    label = { Text("Search")},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier
                        .padding(bottom = padding.calculateBottomPadding())
                        .fillMaxSize(),
                ) {
                    items (filteredGames.size) { index ->
                        val game = filteredGames[index]
                        Box(
                            modifier = Modifier
                                .height(180.dp)
                                .clip(RectangleShape)
                                .clickable {
                                    navController.navigate("detailgamepage/${game.id}")
                                }
                        ) {
                            Image(
                                painter = painterResource(id = game.imageResId),
                                contentDescription = game.name,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(Color.Transparent, Color(0x80000000)),
                                            startY = 40f
                                        )
                                    )
                            )
                            Text(
                                text = game.name,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(8.dp)
                            )
                        }
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GamePagePreview() {
    FEJCToroTheme {
        GamePage(navController = rememberNavController())
    }
}