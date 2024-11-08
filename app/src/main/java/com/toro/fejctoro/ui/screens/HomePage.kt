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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController? = null) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Home",
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
            Column(
                modifier = Modifier
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .fillMaxSize()
                    .background(Color(0xFFD9EAD3))
                    .padding(padding),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                // Nama aplikasi
                Text(
                    text = "Tugas Front End \n " +
                            "Jetpack Compose \n" +
                            "Triantoro Rizky Anggara",
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4CAF50)
                    ),
                    textAlign = TextAlign.Center,
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Logo aplikasi
                Image(
                    painter = painterResource(id = R.drawable.toro),
                    contentDescription = "Foto",
                    modifier = Modifier.size(200.dp)
                )

                Spacer(modifier = Modifier.height(32.dp))

                // Tombol "Screen 1"
                Button(
                    onClick = {
                        navController?.navigate("MoviePage")
                    },
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF81C784)),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(
                        text = "Lazy Column & Row",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Tombol "Screen 2"
                Button(
                    onClick = { /* Handle daftar action */ },
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF81C784)),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(
                        text = "Screen 2",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Tombol "About"
                Button(
                    onClick = { /* Handle masuk action */ },
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF81C784)),
                    shape = RoundedCornerShape(24.dp)
                ) {
                    Text(
                        text = "About",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}
