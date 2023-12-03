package com.example.belajariuran.di

import androidx.room.Room
import com.example.belajariuran.database.IuranDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val localModule = module {
    factory { get<IuranDatabase>().iuranDao() }
    single {
        Room.databaseBuilder(
            androidContext().applicationContext,
            IuranDatabase::class.java, "KPS.db"
        ).build()
    }
}