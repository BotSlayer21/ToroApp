package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Music(
    val id: String,
    val name: String,
    val imageResId: Int,
    val desc: String,
)

object DataMusic{
    fun getMusicData(): List<Music> {
        return listOf(
            Music("MSC1","Twice - Look At Me",R.drawable.toro,"Lorem Ipsum"),
            Music("MSC2","Twice - One Spark", R.drawable.toro, "Lorem Ipsum"),
            Music("MSC3","Jihyo - Killing Me Good", R.drawable.toro,"Lorem Ipsum"),
            Music("MSC4","Twice - Look At Me",R.drawable.toro,"Lorem Ipsum"),
            Music("MSC5","Twice - One Spark", R.drawable.toro, "Lorem Ipsum"),
            Music("MSC6","Jihyo - Killing Me Good", R.drawable.toro,"Lorem Ipsum"),
            Music("MSC7","Twice - Look At Me",R.drawable.toro,"Lorem Ipsum"),
            Music("MSC8","Twice - One Spark", R.drawable.toro, "Lorem Ipsum"),
            Music("MSC9","Jihyo - Killing Me Good", R.drawable.toro,"Lorem Ipsum"),
            Music("MSC10","Twice - Look At Me",R.drawable.toro,"Lorem Ipsum"),
        )
    }
    fun getMusicById(musicId: String) : Music? {
        return getMusicData().find { it.id == musicId }
    }
}