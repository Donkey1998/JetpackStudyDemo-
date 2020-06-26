package com.example.jetpackstudydemo.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.jetpackstudydemo.R
import com.example.jetpackstudydemo.databinding.LoginFragmentBinding
import com.example.jetpackstudydemo.ui.activity.TabActivity
import com.example.jetpackstudydemo.viewmodel.LoginModel

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //1.Binding生成的方式一
        val binding: LoginFragmentBinding = DataBindingUtil.inflate(
            inflater
            , R.layout.login_fragment
            , container
            , false
        )

//        2.Binding生成的方式二
//        val binding = LoginFragmentBinding.inflate( inflater , container , false )

        val loginModel = LoginModel("","",context!!)
        binding.model = loginModel
        binding.activity = activity
        return binding.root
    }

}


