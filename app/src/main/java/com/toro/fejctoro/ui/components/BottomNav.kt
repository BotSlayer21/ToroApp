package com.toro.fejctoro.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.toro.fejctoro.R

sealed class BottomNavItem(val route: String, val icon: Int, val title: String) {
    data object MovieMusic : BottomNavItem("moviemusicpage", R.drawable.ic_movie_music, "Movie & Music")
    data object Games : BottomNavItem("gamepage", R.drawable.ic_game, "Games")
    data object About : BottomNavItem("about", R.drawable.ic_about, "About")
}

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.MovieMusic,
        BottomNavItem.Games,
        BottomNavItem.About
    )

    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    NavigationBar(
        modifier = Modifier
        ,
        containerColor = Color(0xFF37AFE1),
        contentColor = Color.White
    ) {
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Image(
                        contentScale = ContentScale.Crop,
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(50.dp)
                    )
                },
                label = {
                    Text(
                        textAlign = TextAlign.Center,
                        text = item.title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.LightGray,
                    selectedTextColor = Color.White,
                    unselectedTextColor = Color.LightGray
                ),
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            )
        }
    }
}