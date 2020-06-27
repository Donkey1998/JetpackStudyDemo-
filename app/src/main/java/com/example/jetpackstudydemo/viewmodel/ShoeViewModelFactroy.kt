package com.example.jetpackstudydemo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ShoeViewModelFactroy(private val countReserved : Int) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoeViewModel(countReserved) as T
    }

}