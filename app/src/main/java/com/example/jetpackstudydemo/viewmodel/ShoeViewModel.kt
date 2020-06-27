package com.example.jetpackstudydemo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.jetpackstudydemo.Repositroy.Repositroy
import com.example.jetpackstudydemo.Repositroy.User

class ShoeViewModel(countReserved :Int):ViewModel() {
    val counter : LiveData<Int>
        get() = _counter
    private  var _counter = MutableLiveData<Int>()

    private  val userIdLiveData = MutableLiveData<String>()
    val user : LiveData<User> =  Transformations.switchMap(userIdLiveData){ userId ->
        Repositroy.getUser(userId)
    }

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

    fun getUser(userId :String){
        userIdLiveData.value = userId
    }

}
