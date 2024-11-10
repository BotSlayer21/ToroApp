package com.toro.fejctoro.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.toro.fejctoro.ui.components.CustomTopAppBar
import com.toro.fejctoro.ui.components.DescDetailText
import com.toro.fejctoro.ui.components.ErrorMsg
import com.toro.fejctoro.ui.components.ReleaseYear
import com.toro.fejctoro.ui.components.TitleDetailText
import com.toro.fejctoro.ui.models.DataMusic

@Composable
fun DetailMusicPage(navController: NavController, musicId: String){
    Log.d("DetailMusicPage", "musicId: $musicId")
    val musicList = DataMusic.getMusicData()
    val music = musicList.firstOrNull{it.id == musicId}

    if (music != null) {
        Scaffold (
            topBar = {
                CustomTopAppBar(navController = navController, title = music.name)
            }
        ) { padding ->
            Column (
                modifier = Modifier
                    .background(Color(0xFFF1F3C2))
                    .fillMaxSize()
                    .padding(20.dp)
                    .padding(padding)
            ){
                Image(
                    painter = painterResource(id = music.imageResId),
                    contentDescription = music.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(20.dp))
                TitleDetailText(title = music.name)
                ReleaseYear(title = "Release Year: ${music.releaseYear}")
                Spacer(modifier = Modifier.height(8.dp))
                DescDetailText(title = music.desc)
            }
        }
    } else {
        Log.e("MusicDetailPage", "Music with ID $musicId not found!")
        ErrorMsg(msg = "Data Music not found!")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailMusicPagePreview() {
    DetailMusicPage(navController = rememberNavController(), musicId = "MSC1")
}