package com.example.jetpackstudydemo.ui.activity

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyLifeCycleObserver(val lifecycle : Lifecycle) : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start(){
        Log.d("MyLifeCycleObserver","Start")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop(){
        Log.d("MyLifeCycleObserver","Stop")
    }


}