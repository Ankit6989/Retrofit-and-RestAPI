package com.apcoding.retrofitandrestapi.repo

import com.apcoding.retrofitandrestapi.data.remote.GameService
import com.apcoding.retrofitandrestapi.domain.item.GameItem
import com.apcoding.retrofitandrestapi.domain.item.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames() : List<GameItem> {
        return gameService.getGames().map {
            it.toGameItem()

            }
        }
    }