package com.example.sportstrainer.data

import com.example.sportstrainer.model.Sport
import com.example.sportstrainer.R

object SportsDataSource {

    val sports : List<Sport> = listOf(
        Sport(1, "Hockey", R.drawable.hockey),
        Sport(2, "Basketball", R.drawable.basketball),
        Sport(3, "Soccer", R.drawable.soccer),
        Sport(4, "Volleyball", R.drawable.volleyball),
        Sport(5, "Golf", R.drawable.golf),
        Sport(6, "Tennis", R.drawable.tennis)
    )

}