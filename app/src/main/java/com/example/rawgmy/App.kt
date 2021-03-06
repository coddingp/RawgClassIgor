package com.example.rawgmy

import android.app.Application
import com.example.rawgmy.common.CommonModule
import com.example.rawgmy.main.di.MainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@App)
            modules(
                CommonModule.createRetrofit(),
                MainModule.create()
            )
        }
    }
}