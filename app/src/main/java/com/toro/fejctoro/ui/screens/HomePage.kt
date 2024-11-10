package com.toro.fejctoro.ui.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.R
import com.toro.fejctoro.ui.components.BottomNavBar
import com.toro.fejctoro.ui.components.HomeTopAppBar

@Composable
fun HomeScreen(navController: NavController? = null) {
    Scaffold(
        topBar = {
            HomeTopAppBar(title = "My Favorite List App")
        },
        bottomBar = {
            if (navController != null) {
                BottomNavBar(navController=navController)
            }
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .fillMaxSize()
                    .background(Color(0xFFF1F3C2))
                    .padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Nama aplikasi
                Text(
                    "Hello my name is\n" +
                        "Triantoro Rizky Anggara",
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50)
                    ),
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.me),
                    contentDescription = "Foto",
                    modifier = Modifier
                        .background(Color.Black, CircleShape)
                        .clip(CircleShape)
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    "This Application is about my favorite\n" +
                         "Movie, Music, Games, also my profile",
                    style = TextStyle(
                        fontSize = 23.sp,
//                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50)
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
