package com.bigaton.hogwarts.ui


import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import com.bigaton.hogwarts.R

enum class HouseType(@DrawableRes val logo: Int, @ColorRes val color: Int) {
    Gryffindor(R.drawable.logo_gryffindor, R.color.red900dark),
    Slytherin(R.drawable.logo_slytherin, R.color.green900dark),
    Ravenclaw(R.drawable.logo_ravenclaw, R.color.blue900dark),
    Hufflepuff(R.drawable.logo_hufflepuff, R.color.yellowA700dark)
}