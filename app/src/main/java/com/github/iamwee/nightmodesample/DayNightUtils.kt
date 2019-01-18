package com.github.iamwee.nightmodesample

import android.content.Context

object DayNightUtils {

    private const val PREF_NIGHT_MODE = "pref.nightMode"
    private const val PREF_IS_NIGHT_MODE = "pref.nightMode.isNightMode"

    private val pref by lazy {
        Contextor.context.getSharedPreferences(PREF_NIGHT_MODE, Context.MODE_PRIVATE)
    }

    var isNightMode
        get() = pref.getBoolean(PREF_IS_NIGHT_MODE, false)
        set(value) {
            pref.edit().putBoolean(PREF_IS_NIGHT_MODE, value).apply()
        }

}