package com.example.rawgmy.main.api.model

import com.google.gson.annotations.SerializedName

data class GameStatusResponse(
    @SerializedName("yet")
    val yet: Int,
    @SerializedName("owned")
    val owned: Int,
    @SerializedName("beaten")
    val beaten: Int,
    @SerializedName("toplay")
    val toplay: Int,
    @SerializedName("dropped")
    val dropped: Int,
    @SerializedName("playing")
    val playing: Int
)