package com.bigaton.hogwarts.di

import com.bigaton.hogwarts.data.remote.RemoteDataSource
import com.bigaton.hogwarts.data.remote.RemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(service = get()) }
}