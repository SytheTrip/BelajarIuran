package com.example.belajariuran

import android.app.Application
import com.example.belajariuran.di.localModule
import com.example.belajariuran.di.repositoryModule
import com.example.belajariuran.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidContext(this@MyApplication)
            modules(viewModule, repositoryModule, localModule)
        }
    }
}