package com.duzieblo.cryptotrans.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.duzieblo.cryptotrans.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class AppViewModelFactory: ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel() as T
        }

        throw IllegalArgumentException("${modelClass.name} doesn't exit")
    }

}