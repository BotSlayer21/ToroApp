package com.toro.fejctoro.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.R
import com.toro.fejctoro.ui.components.AboutText
import com.toro.fejctoro.ui.components.BottomNavBar
import com.toro.fejctoro.ui.components.CustomTopAppBar

@Composable
fun AboutPage(navController: NavController) {
    Scaffold (
        topBar = {
            CustomTopAppBar(navController = navController, title = "About Me")
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
                    .padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
            ){
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                     "This page is about my Profile",
                    fontSize = 24.sp,
                    color = Color(0xFF2E7D32),
                    fontWeight = FontWeight.Bold,
                )

                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painter = painterResource(id = R.drawable.toro),
                    contentDescription = "Foto",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                )

                Spacer(modifier = Modifier.height(20.dp))
                AboutText(title = "Name : Triantoro Rizky Anggara")
                AboutText(title = "Email : t21rizkianggara@gmail.com")
                AboutText(title = "University : Dinamika Bangsa University")
                AboutText(title = "Major : Information System")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AboutPreview() {
    AboutPage(navController = rememberNavController())
}