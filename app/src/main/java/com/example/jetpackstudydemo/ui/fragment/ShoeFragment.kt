package com.example.jetpackstudydemo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.jetpackstudydemo.R
import com.example.jetpackstudydemo.ui.activity.MyLifeCycleObserver
import com.example.jetpackstudydemo.viewmodel.ShoeViewModel
import com.example.jetpackstudydemo.viewmodel.ShoeViewModelFactroy
import kotlinx.android.synthetic.main.shoe_fragment.*

class ShoeFragment : Fragment() {
    lateinit var shoeViewModel : ShoeViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lifecycle.addObserver(MyLifeCycleObserver(lifecycle))
        return inflater.inflate(R.layout.shoe_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val countReserved : Int = 0
        shoeViewModel = ViewModelProviders.of(this,ShoeViewModelFactroy(countReserved)).get(ShoeViewModel::class.java)
//        shoeViewModel = ViewModelProviders.of(this).get(ShoeViewModel::class.java)
        plusOneBtn.setOnClickListener {
            shoeViewModel.counter++
            refreshCounter()
        }
        clearBtn.setOnClickListener {
            shoeViewModel.counter = 0
            Toast.makeText(context, "获取当前Fragment生命周期"+lifecycle.currentState.toString(), Toast.LENGTH_SHORT).show()
            refreshCounter()
        }
        refreshCounter()
    }

    private fun refreshCounter(){
        infoText.text = shoeViewModel.counter.toString()
    }
}