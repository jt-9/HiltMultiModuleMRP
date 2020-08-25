package com.example.feature.main

import android.os.Bundle
import androidx.activity.viewModels
import com.example.base_ui.BaseViewModelActivity
import com.example.feature.R
import com.example.feature.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseViewModelActivity<ActivityMainBinding, MainActivityViewModel>(R.layout.activity_main) {

    override val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.logSelfState()
    }

    companion object {
        private val LOG_TAG = MainActivity::class.java.simpleName
    }
}