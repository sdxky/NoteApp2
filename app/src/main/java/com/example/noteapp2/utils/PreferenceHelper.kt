package com.example.noteapp2.utils

import android.content.Context
import android.content.SharedPreferences

class  PreferenceHelper {
    private lateinit var sharedPreferences: SharedPreferences

    fun unit(context: Context){
        sharedPreferences = context.getSharedPreferences("shared", Context.MODE_PRIVATE)
    }

    var onBoardShown: Boolean
        get() = sharedPreferences.getBoolean("onBoard", false)
        set(value) = sharedPreferences.edit().putBoolean("onBoard", value).apply()
}