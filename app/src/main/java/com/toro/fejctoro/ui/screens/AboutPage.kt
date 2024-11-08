package com.toro.fejctoro.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutPage(navController: NavController) {
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "About Me",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor =  Color(0xFF4CAF50)
                )
            )
        },
        
    content = { padding ->
        Column (
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
                .fillMaxSize()
                .background(Color(0xFFD9EAD3))
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
        ){
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "This page is about me",
            )

            Spacer(modifier = Modifier
                .height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.toro),
                contentDescription = "Foto",
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier
                .height(20.dp))

            Text(text = "Nama : Triantoro Rizky Anggara")
            Text(text = "Email : t21rizkianggara@gmail.com")
            Text(text = "Asal Universitas : Universitas Dinamika Bangsa")
            Text(text = "Jurusan : Sistem Informasi")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AboutPreview() {
    AboutPage(navController = rememberNavController())
}