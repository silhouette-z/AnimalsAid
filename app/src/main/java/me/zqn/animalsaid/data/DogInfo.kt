package me.zqn.animalsaid.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import me.zqn.animalsaid.R
import java.io.Serializable

data class DogInfo(
    @StringRes val name: Int,
    @StringRes val introduce: Int,
    @DrawableRes var imageId: Int = R.drawable.ic_launcher_background
) : Serializable