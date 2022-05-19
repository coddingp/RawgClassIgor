package com.example.rawgmy.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class MainItems: Parcelable {
    abstract val type: Int

    @Parcelize
    data class GameWithText(
        val name: String,
        val description: String,
        val info: String,
        val date: String,
        override val type: Int = 2
    ) : MainItems()

    @Parcelize
    data class GameWithSmallIcon(
        val img: String,
        val name: String,
        val description: String,
        val info: String,
        val date: String,
        override val type: Int = 3
    ) : MainItems()

    @Parcelize
    data class GameWithBigIcon(
        val img: String,
        val name: String,
        override val type: Int = 4
    ) : MainItems()

}
