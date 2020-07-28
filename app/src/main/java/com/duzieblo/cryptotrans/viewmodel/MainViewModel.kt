package com.duzieblo.cryptotrans.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val className = this.javaClass.name

    init {
        Log.d(className, "Init MainViewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(className, "MainViewModel destroyed")
    }
}