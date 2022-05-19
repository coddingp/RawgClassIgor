package com.example.rawgmy.main.api.model

import com.google.gson.annotations.SerializedName

data class ParentGamePlatformDataResponse(
    @SerializedName("id")
    val id: Short,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String
)