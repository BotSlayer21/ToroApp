package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Movie(
    val id: String,
    val name: String,
    val imageResId: Int,
    val director: String,
    val releaseYear: String,
    val desc: String,
)

object DataMovie{
    fun getMovieData(): List<Movie> {
        return listOf(
        Movie("MVE1","Rush",R.drawable.rush,
            "Ron Howard",
            "1 October 2013",
            "A biographical sports drama film that tells the true story of the rivalry between Formula One drivers James Hunt and Niki Lauda in the 1970s."),
        Movie("MVE2","Schumacher", R.drawable.schumacher,
            "Hanns-Bruno Kammertöns, Vanessa Nöcker, Michael Wech",
            "15 September 2021",
            "Through exclusive interviews and archival footage, this documentary traces an intimate portrait of seven-time Formula 1 champion Michael Schumacher."),
        Movie("MVE3","The Fast and The Furious",R.drawable.the_fast_furious,
            "Rob Cohen",
            "22 June 2001",
            "Los Angeles police officer Brian O'Conner must decide where his loyalty really lies when he becomes enamored with the street racing world he has been sent undercover to end it."),
        Movie("MVE4","Gran Turismo", R.drawable.gran_turismo,
            "Neill Blomkamp",
            "23 August 2023",
            "Based on the unbelievable, inspiring true story of a team of underdogs - a struggling, working-class gamer, a failed former race car driver, and an idealistic motorsport exec - who risk it all to take on the most elite sport in the world."),
        Movie("MVE5","Rush Hour",R.drawable.rush_hour,
            "Brett Ratner",
            "18 September 1998",
            "A Hong Kong detective teams up with a reckless Los Angeles cop to find a kidnapped Chinese diplomat's daughter."),
        Movie("MVE6","Ted", R.drawable.ted,
            "Seth MacFarlane",
            "19 September 2012",
            "John Bennett, a man whose childhood wish of bringing his teddy bear to life came true, now must decide between keeping the relationship with the bear, Ted or his girlfriend, Lori."),
        Movie("MVE7","5cm",R.drawable.lima_cm,
            "Rizal Mantovani",
            "12 December 2012",
            "Five best friends try to find out what true friendship is by climbing Mount Semeru, the highest peak in Java."),
        Movie("MVE8","Pengabdi Setan", R.drawable.pengabdi_setan,
            "Joko Anwar",
            "28 September 2017",
            "After dying from a strange illness that she suffered for 3 years, a mother returns home to pick up her children."),
        Movie("MVE9","Comic 8",R.drawable.c8,
            "Anggy Umbara",
            "29 January 2014",
            "When eight young men with different motives for stealing converge at the same bank heist, they try to find out if it's chance or part of a bigger plan."),
        Movie("MVE10","Kambing Jantan", R.drawable.kambing_jantan,
            "Rudy Soedjarwo",
            "5 March 2009",
            "Dika just finished high school and went to Australia for college because of his mother. While in Australia, he must face a long distance relationship with her long time girlfriend."),
        )
    }
    fun getMovieById(movieId: String) : Movie? {
        return getMovieData().find { it.id == movieId }
    }
}