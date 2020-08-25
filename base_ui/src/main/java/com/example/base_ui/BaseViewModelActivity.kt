package com.example.base_ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseViewModelActivity<LayoutDataBinding : ViewDataBinding, VM : ViewModel>(
    @LayoutRes private val layoutRes: Int
): AppCompatActivity() {
    protected abstract val viewModel: VM
    protected var layoutBindingHolder: LayoutDataBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layoutBindingHolder = DataBindingUtil.setContentView(this, layoutRes)
    }

    override fun onDestroy() {
        super.onDestroy()

        layoutBindingHolder = null
    }
}