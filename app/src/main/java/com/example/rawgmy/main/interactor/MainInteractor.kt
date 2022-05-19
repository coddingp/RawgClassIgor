package com.example.rawgmy.main.interactor

import com.example.rawgmy.main.repository.MainRemoteRepository

class MainInteractor(
    private val remoteRepository: MainRemoteRepository
) {
    suspend fun getGames() =
        remoteRepository.getGames()
}