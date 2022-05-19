package com.example.rawgmy.main.api

import com.example.rawgmy.main.api.model.GeneralDataResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GamesApi {
    @GET("games")
    suspend fun getGames(
        @Query("key") key: String
    ): GeneralDataResponse
}