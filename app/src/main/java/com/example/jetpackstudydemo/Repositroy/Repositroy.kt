package com.example.jetpackstudydemo.Repositroy

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object Repositroy {
    fun getUser(userId : String) : LiveData<User>{
        val liveData = MutableLiveData<User>()
        liveData.value = User(userId,userId,0)
        return liveData
    }
}