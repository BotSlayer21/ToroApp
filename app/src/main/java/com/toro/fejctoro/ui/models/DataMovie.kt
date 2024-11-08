package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Movie(
    val name: String,
    val imageResId: Int,
    val desc: String,
)

object DataMovie{
    fun getMovieData(): List<Movie> {
        return listOf(
        Movie("Rush",R.drawable.toro,"Lorem Ipsum"),
        Movie("Formula 1 Drive To Survive", R.drawable.toro, "Lorem Ipsum"),
        )
    }
}