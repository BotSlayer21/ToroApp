package com.toro.fejctoro.ui.models

import com.toro.fejctoro.R

data class Music(
    val id: String,
    val name: String,
    val imageResId: Int,
    val releaseYear: String,
    val desc: String,
)

object DataMusic{
    fun getMusicData(): List<Music> {
        return listOf(
            Music("MSC1","Twice - Look At Me",R.drawable.look_at_me,
                "30 October 2017",
                "In early 2024,Look at me’s chorus went viral on various social media platforms.Eventually,the song became a dance challenge with thousands of fans/social media users participating while it was viral.The song became so popular itself,that the members of TWICE even joined in on the challenge.The song also became popular on Spotify and other streaming platforms,which holds over 41 million streams on the app/website as of June 2024."),
            Music("MSC2","Twice - One Spark",R.drawable.one_spark,
                "23 February 2024",
                "One Spark is a song recorded by South Korean girl group Twice. It was released as the lead single of their thirteenth extended play With You-th on February 23, 2024. It was written by Kyler Niko, Earattack, Paulina \"PAU\" Cerrilla, Lee Woo-hyun, Sim Eunjee and Melanie Fontana. One Spark peaked at number 93 on the Billboard Global 200 and number 126 on South Korea's Circle Digital Chart. It also entered charts in Hong Kong, Japan, Malaysia, and Singapore, and the top ten in Taiwan."),
            Music("MSC3","Jihyo - Killing Me Good",R.drawable.jihyo,
                "18 August 2023",
                "Killin Me Good is a song recorded by South Korean singer Jihyo for her debut extended play, Zone. It was released as the lead single by JYP Entertainment and Republic Records on August 18, 2023. An English version of the song was released on September 15, 2023. The song peaked at number 193 on the Billboard Global 200 and number 148 on South Korea's Circle Digital Chart. In the United States, it peaked at number seven on the Billboard World Digital Song Sales chart."),
            Music("MSC4","Yonezu Kenshi - Shunrai", R.drawable.shunrai,
                "5 December 2017",
                "Shunrai is a song by Japanese singer-songwriter Yonezu Kenshi. Known for his unique voice and poetic lyrics, Yonezu blends folk and modern sounds in this single, which quickly became a fan favorite. The song highlights themes of resilience and nature, resonating with a wide audience in Japan and beyond."),
            Music("MSC5","Avenged Sevenfold - Dear God", R.drawable.dear_god,
                "29 July 2008",
                "Dear God is a song by American rock band Avenged Sevenfold. It was released as the fourth and final single from their self-titled album. The song diverges from the band’s usual heavy metal sound, showcasing a more country-rock vibe. Lyrically, it explores themes of love, longing, and regret."),
            Music("MSC6","Didi Kempot - Prawan Kalimantan", R.drawable.dk_prawan,
                "15 April 2002",
                "Prawan Kalimantan is a song by legendary Indonesian artist Didi Kempot. Known for his heartfelt lyrics and strong connection to Indonesian culture, this song beautifully captures the essence of love and longing. It has become a classic in Didi Kempot's discography."),
            Music("MSC7","Didi Kempot - Jambu Alas", R.drawable.jambu_alas,
                "10 October 2001",
                "Jambu Alas is another classic song by Indonesian 'Godfather of Broken Heart,' Didi Kempot. Through melancholic lyrics and traditional Javanese melodies, the song explores themes of unrequited love and cultural roots, resonating deeply with fans of campursari music."),
            Music("MSC8","Killing Me Inside - Kamu", R.drawable.kmi_kamu,
                "25 August 2009",
                "Kamu is a popular track by Indonesian rock band Killing Me Inside. Known for their emotionally charged lyrics and alternative rock style, this song focuses on heartbreak and longing, making it a hit among fans of Indonesian rock music."),
            Music("MSC9","Chrisye - Pergilah Kasih", R.drawable.chrisye,
                "1991",
                "Pergilah Kasih is one of the iconic songs by Indonesian legend Chrisye. Released in 1991, the song has stood the test of time with its melancholic theme of parting and unforgettable melody. Chrisye's emotive delivery makes this song a classic in Indonesian pop music history."),
            Music("MSC10","Bruno Mars - 24K Magic", R.drawable.bm_24k,
                "7 October 2016",
                "24K Magic is a vibrant song by American singer Bruno Mars, released as the lead single from his third studio album of the same name. With a funky beat, flashy lyrics, and an old-school vibe, this track celebrates luxury and confidence, becoming a major hit worldwide.")
        )
    }
    fun getMusicById(musicId: String) : Music? {
        return getMusicData().find { it.id == musicId }
    }
}