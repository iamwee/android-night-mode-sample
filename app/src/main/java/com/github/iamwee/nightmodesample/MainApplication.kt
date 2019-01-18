package com.github.iamwee.nightmodesample

import android.app.Application


class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Contextor.context = applicationContext
    }
}