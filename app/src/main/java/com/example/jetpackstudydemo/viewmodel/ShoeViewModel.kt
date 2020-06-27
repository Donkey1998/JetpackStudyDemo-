package com.example.jetpackstudydemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel(countReserved :Int):ViewModel() {
    val counter : LiveData<Int>
        get() = _counter
    private  var _counter = MutableLiveData<Int>()
    init {
        _counter.value = countReserved
    }

    fun plusOne(){
        val count = _counter.value?:0
        _counter.value = count+1
    }

    fun clear() {
        _counter.value = 0
    }
}
