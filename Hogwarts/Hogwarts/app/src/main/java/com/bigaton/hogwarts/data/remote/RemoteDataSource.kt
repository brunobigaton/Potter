package com.bigaton.hogwarts.data.remote


import com.bigaton.hogwarts.model.Character

interface RemoteDataSource {

    suspend fun getCharacters(type: String) : List<Character>

}