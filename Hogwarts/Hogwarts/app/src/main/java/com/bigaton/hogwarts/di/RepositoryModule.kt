package com.bigaton.hogwarts.di

import com.bigaton.hogwarts.data.repository.Repository
import com.bigaton.hogwarts.data.repository.RepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<Repository> { RepositoryImpl(remoteDataSource = get()) }
}