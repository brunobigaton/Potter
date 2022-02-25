package com.bigaton.hogwarts.di

import com.bigaton.hogwarts.ui.detail.DetailViewModel
import com.bigaton.hogwarts.ui.HouseType
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { (type: HouseType) -> DetailViewModel(type, repository = get()) }
}