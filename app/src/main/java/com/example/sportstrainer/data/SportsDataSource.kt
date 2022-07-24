package com.example.sportstrainer.data

import com.example.sportstrainer.model.Sport
import com.example.sportstrainer.R

object SportsDataSource {

    val sports : List<Sport> = listOf(
        Sport(1, "Hockey", R.drawable.sport_hockey),
        Sport(2, "Basketball", R.drawable.sport_basketball),
        Sport(3, "Soccer", R.drawable.sport_soccer),
        Sport(4, "Volleyball", R.drawable.sport_volleyball),
        Sport(5, "Golf", R.drawable.sport_golf),
        Sport(6, "Tennis", R.drawable.sport_tennis)
    )

}