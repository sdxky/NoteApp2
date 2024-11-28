package com.example.noteapp2

import android.app.Application
import com.example.noteapp2.utils.PreferenceHelper

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        val preferenceHelper = PreferenceHelper()
        preferenceHelper.unit(this)
    }
}