package com.example.rawgmy.model

import com.example.rawgmy.main.api.model.GeneralDataResponse


object MainConverter {
    fun fromNetWork(response: GeneralDataResponse): List<MainItems> {
        val first = MainItems.GameWithSmallIcon(
            name = response.resultsResponse.firstOrNull()?.name.orEmpty(),
            description = response.description,
            info = "response.resultsResponse.firstOrNull()?.platformResponse.",
            date = response.resultsResponse.firstOrNull()?.released.orEmpty(),
            img = response.resultsResponse.firstOrNull()?.backgroundImage.orEmpty()
        )
        return listOf(first)
    }
}