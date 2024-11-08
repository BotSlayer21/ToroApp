package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Game(
    val name: String,
    val imageResId: Int,
    val desc: String,
)

object DataGame{
    fun getGameData(): List<Game> {
        return listOf(
            Game("Black Myth Wukong", R.drawable.toro, "Lorem Ipsum"),
            Game("Tekken 8",R.drawable.toro,"Lorem Ipsum"),
            Game("F1 2023", R.drawable.toro, "Lorem Ipsum"),
            Game("Mirror Edge", R.drawable.toro, "Lorem Ipsum"),
        )
    }
}