package com.example.feature.main

import android.util.Log
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.db.AppDataBase

class MainActivityViewModel @ViewModelInject constructor(private val appDataBase: AppDataBase,
    @Assisted private val savedStateHandle: SavedStateHandle
): ViewModel() {

    fun logSelfState() {
        Log.d(LOG_TAG, "${MainActivityViewModel::class.java.simpleName} instance $this is injected with\nsavedStateHandle: $savedStateHandle\ndb: $appDataBase")
    }

    companion object {
        private val LOG_TAG = MainActivityViewModel::class.java.simpleName
    }
}