package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Game(
    val id: String,
    val name: String,
    val imageResId: Int,
    val dev: String,
    val releaseYear: String,
    val desc: String,
)

object DataGame{
    fun getGameData(): List<Game> {
        return listOf(
            Game("G1","Tekken 8",R.drawable.tekken,
                 "Bandai Namco Studios Inc.",
                "26 January 2024",
                "The latest installment in the long-running fighting game franchise."),
            Game("G2","Black Myth Wukong",R.drawable.wukong,
                "Game Science",
                "20 August 2024",
                "Black Myth: Wukong is an action RPG rooted in Chinese mythology. You shall set out as the Destined One to venture into the challenges and marvels ahead, to uncover the obscured truth beneath the veil of a glorious legend from the past."),
            Game("G3","F1 2023",R.drawable.f1,
                "Codemasters",
                "16 June 2023",
                "Be the last to brake in EA SPORTS™ F1® 23, the official video game of the 2023 FIA Formula One World Championship™. A new chapter in the thrilling \"Braking Point\" story mode delivers high-speed drama and heated rivalries."),
            Game("G4","Mirror Edge",R.drawable.mirroredge,
                "DICE",
                "13 January 2009",
                "In a city where information is heavily monitored, couriers called Runners transport sensitive data. In this seemingly utopian paradise, a crime has been committed, & you are being hunted. You are a Runner called Faith and this innovative first-person action-adventure is your story."),
            Game("G5", "House Flipper", R.drawable.hf,
                "Empyrean",
                "17 May 2018",
                "A renovation simulator where you buy dilapidated houses, fix them up, and sell them for a profit."),
            Game("G6","Mirror Edge Catalyst",R.drawable.mecatalyst,
                "DICE",
                "7 June 2016",
                "Mirror's Edge™ Catalyst raises the action-adventure bar through fluid, first person action and immerses players in Faith's story as she fights for freedom."),
            Game("G7","EA Sports FC 24",R.drawable.fc24,
                "Electronic Arts",
                "28 September 2023",
                "EA SPORTS FC™ 24 welcomes you to The World’s Game: the most true-to-football experience ever with HyperMotionV, PlayStyles optimised by Opta, and an enhanced Frostbite™ Engine."),
            Game("G8","Trials Fusion",R.drawable.trials_fusion,
                "RedLynx",
                "25 April 2014",
                "Trials Fusion is the gold-standard platform racer for the next-generation of gaming. Built upon the Trials franchise’s proven gameplay foundations, Fusion challenges players endlessly in both classic and all-new ways."),
            Game("G9","Valentino Rossi The Game",R.drawable.vr46,
                "Milestone S.r.l.",
                "16 June 2016",
                "The most complete MotoGP™ game ever! Join Valentino Rossi’s VR|46 Riders Academy and train with him in order to become the new champion of the 2016 MotoGP™ season!"),
            Game("G10", "Quantum Break", R.drawable.qb,
                "Remedy Entertainment",
                "29 Sep 20216",
                "From Remedy Entertainment, the masters of cinematic action games, comes Quantum Break, a time-amplified suspenseful blockbuster. The Quantum Break experience is part game, part live action show—where decisions in one dramatically affect the other.")
        )
    }
    fun getGameById(gameId: String) : Game? {
        return getGameData().find {it.id == gameId}
    }
}