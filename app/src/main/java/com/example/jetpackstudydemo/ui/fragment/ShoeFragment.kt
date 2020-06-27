package com.example.jetpackstudydemo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.jetpackstudydemo.R
import com.example.jetpackstudydemo.viewmodel.ShoeViewModel
import kotlinx.android.synthetic.main.shoe_fragment.*

class ShoeFragment : Fragment() {
    lateinit var shoeViewModel : ShoeViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.shoe_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shoeViewModel = ViewModelProviders.of(this).get(ShoeViewModel::class.java)
        plusOneBtn.setOnClickListener {
            shoeViewModel.counter++
            refreshCounter()
        }
        refreshCounter()
    }

    private fun refreshCounter(){
        infoText.text = shoeViewModel.counter.toString()
    }
}