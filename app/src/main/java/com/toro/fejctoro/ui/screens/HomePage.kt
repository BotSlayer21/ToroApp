package com.toro.fejctoro.ui.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.toro.fejctoro.R

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD9EAD3)),
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
            modifier = Modifier.size(120.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Tombol "Screen 1"
        Button(
            onClick = { /* Handle masuk action */ },
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF81C784)),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text(
                text = "Screen 1",
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
            colors = ButtonDefaults.buttonColors(Color(0xFF81C784)), // Warna tombol hijau terang
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

        Button(
            onClick = { /* Handle masuk action */ },
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF81C784)), // Warna tombol hijau terang
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

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
