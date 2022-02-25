package com.bigaton.hogwarts


import android.app.Application
import com.bigaton.hogwarts.di.dataSourceModule
import com.bigaton.hogwarts.di.networkModule
import com.bigaton.hogwarts.di.repositoryModule
import com.bigaton.hogwarts.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HarryPotterApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@HarryPotterApp)
            modules(dataSourceModule)
            modules(repositoryModule)
            modules(viewModelModule)
            modules(networkModule)
        }
    }

}