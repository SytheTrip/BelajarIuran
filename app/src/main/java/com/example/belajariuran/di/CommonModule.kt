package com.example.belajariuran.di

import com.example.belajariuran.repository.IuranRepository
import com.example.belajariuran.ui.home.HomeViewModel
import org.koin.dsl.module

val repositoryModule = module {
    single { IuranRepository(get(),get()) }
}
val viewModule = module {
    single { HomeViewModel(get()) }
}