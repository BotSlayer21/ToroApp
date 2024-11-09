package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Movie(
    val id: String,
    val name: String,
    val imageResId: Int,
    val desc: String,
)

object DataMovie{
    fun getMovieData(): List<Movie> {
        return listOf(
        Movie("MVE1","Rush",R.drawable.toro,"Lorem Ipsum"),
        Movie("MVE2","Formula 1 Drive To Survive", R.drawable.toro, "Lorem Ipsum"),
        Movie("MVE3","Rush",R.drawable.toro,"Lorem Ipsum"),
        Movie("MVE4","Formula 1 Drive To Survive", R.drawable.toro, "Lorem Ipsum"),
        Movie("MVE5","Rush",R.drawable.toro,"Lorem Ipsum"),
        Movie("MVE6","Formula 1 Drive To Survive", R.drawable.toro, "Lorem Ipsum"),
        Movie("MVE7","Rush",R.drawable.toro,"Lorem Ipsum"),
        Movie("MVE8","Formula 1 Drive To Survive", R.drawable.toro, "Lorem Ipsum"),
        Movie("MVE9","Rush",R.drawable.toro,"Lorem Ipsum"),
        Movie("MVE10","Formula 1 Drive To Survive", R.drawable.toro, "Lorem Ipsum"),
        )
    }
    fun getMovieById(movieId: String) : Movie? {
        return getMovieData().find { it.id == movieId }
    }
}