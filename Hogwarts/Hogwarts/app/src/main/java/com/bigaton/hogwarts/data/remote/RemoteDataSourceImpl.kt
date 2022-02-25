package com.bigaton.hogwarts.data.remote


import com.bigaton.hogwarts.data.service.HarryPotterService

class RemoteDataSourceImpl(private val service: HarryPotterService) : RemoteDataSource {

    override suspend fun getCharacters(type: String) = service.getCharacters(type)

}