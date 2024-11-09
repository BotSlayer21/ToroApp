package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Game(
    val id: String,
    val name: String,
    val imageResId: Int,
    val desc: String,
)

object DataGame{
    fun getGameData(): List<Game> {
        return listOf(
            Game("G1","Tekken 8",R.drawable.tekken,"Lorem Ipsum"),
            Game("G2","Black Myth Wukong", R.drawable.toro, "Lorem Ipsum"),
            Game("G3","F1 2023", R.drawable.toro, "Lorem Ipsum"),
            Game("G4","Mirror Edge", R.drawable.toro, "Lorem Ipsum"),
            Game("G5", "House Flipper", R.drawable.toro, "Lorem Ipsum"),
            Game("G6","Tekken 8",R.drawable.toro,"Lorem Ipsum"),
            Game("G7","Black Myth Wukong", R.drawable.toro, "Lorem Ipsum"),
            Game("G8","F1 2023", R.drawable.toro, "Lorem Ipsum"),
            Game("G9","Mirror Edge", R.drawable.toro, "Lorem Ipsum"),
            Game("G10", "House Flipper", R.drawable.toro, "Lorem Ipsum")
        )
    }
    fun getGameById(gameId: String) : Game? {
        return getGameData().find {it.id == gameId}
    }
}