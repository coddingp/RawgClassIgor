package com.example.rawgmy.main.repository

import com.example.rawgmy.main.api.GamesApi
import com.example.rawgmy.model.MainConverter
import com.example.rawgmy.model.MainItems
import com.example.rawgmy.utils.Utils.API_KEY

class MainRemoteRepository(
    private val api: GamesApi
) : MainRepository {
    override suspend fun getGames(): List<MainItems> {
        val data = api.getGames(API_KEY)
        return MainConverter.fromNetWork(data)
    }

}