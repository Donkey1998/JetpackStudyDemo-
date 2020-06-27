package com.example.jetpackstudydemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel(countReserved :Int):ViewModel() {
    var counter = MutableLiveData<Int>()
    init {
        counter.value = countReserved
    }

    fun plusOne(){
        val count = counter.value?:0
        counter.value = count+1
    }

    fun clear() {
        counter.value = 0
    }
}
