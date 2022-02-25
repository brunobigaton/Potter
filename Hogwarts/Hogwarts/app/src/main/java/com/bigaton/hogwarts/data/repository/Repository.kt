package com.bigaton.hogwarts.data.repository


import com.bigaton.hogwarts.model.Character

interface Repository {

    suspend fun getCharacters(type: String) : List<Character>

}