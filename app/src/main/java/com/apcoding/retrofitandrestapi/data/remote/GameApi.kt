package com.apcoding.retrofitandrestapi.data.remote

import com.apcoding.retrofitandrestapi.data.remote.model.GameModel
import com.apcoding.retrofitandrestapi.util.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

}