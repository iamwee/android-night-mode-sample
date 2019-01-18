package com.github.iamwee.nightmodesample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate


@SuppressLint("Registered")
open class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val nightMode = if (DayNightUtils.isNightMode) {
            AppCompatDelegate.MODE_NIGHT_YES
        } else {
            AppCompatDelegate.MODE_NIGHT_NO
        }
        AppCompatDelegate.setDefaultNightMode(nightMode)
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

    }

}