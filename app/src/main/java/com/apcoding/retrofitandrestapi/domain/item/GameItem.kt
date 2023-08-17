package com.apcoding.retrofitandrestapi.domain.item

import com.apcoding.retrofitandrestapi.data.remote.model.GameModel

data class GameItem (

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String,
)

fun GameModel.toGameItem() = GameItem(
    id = id,
    title = title,
    thumbnail = thumbnail,
    short_description = short_description,
)