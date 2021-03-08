package com.example.aprende.common

import android.app.Application
import com.example.aprende.api.NetworkContainer

class MyApp: Application() {
    companion object{
        lateinit var instance:MyApp
        val networkContainer = NetworkContainer()
    }

    override fun onCreate() {
        super.onCreate()
        instance=this

    }
}