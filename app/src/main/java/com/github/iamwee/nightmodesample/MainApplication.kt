package com.github.iamwee.nightmodesample

import android.app.Application
import com.github.iamwee.nightmodesample.utils.Contextor


class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Contextor.context = applicationContext
    }
}