package com.example.rawgmy.main.repository

import com.example.rawgmy.model.MainItems

interface MainRepository {
    suspend fun getGames():List<MainItems>
}