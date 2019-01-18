package com.github.iamwee.nightmodesample.utils

import android.content.Context

object DayNightUtils {

    private const val PREF_NIGHT_MODE = "pref.nightMode"
    private const val KEY_IS_NIGHT_MODE = "pref.nightMode.isNightMode"

    private val pref by lazy { Contextor.context.getSharedPreferences(PREF_NIGHT_MODE, Context.MODE_PRIVATE) }

    var isNightMode
        get() = pref.getBoolean(KEY_IS_NIGHT_MODE, false)
        set(value) {
            pref.edit().putBoolean(KEY_IS_NIGHT_MODE, value).apply()
        }

}