package com.apcoding.retrofitandrestapi.domain

import com.apcoding.retrofitandrestapi.domain.item.GameItem
import com.apcoding.retrofitandrestapi.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke() : List<GameItem> {

        return gameRepository.getGames().shuffled()

    }
}