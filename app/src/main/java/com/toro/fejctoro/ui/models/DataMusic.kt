package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Music(
    val name: String,
    val imageResId: Int,
    val desc: String,
)

object DataMusic{
    fun getMusicData(): List<Music> {
        return listOf(
            Music("Twice - Look At Me",R.drawable.toro,"Lorem Ipsum"),
            Music("Twice - One Spark", R.drawable.toro, "Lorem Ipsum"),
            Music("Jihyo - Killing Me Good", R.drawable.toro,"Lorem Ipsum")
        )
    }
}