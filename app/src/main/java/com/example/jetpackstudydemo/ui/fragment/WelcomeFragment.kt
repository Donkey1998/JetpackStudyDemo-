package com.example.jetpackstudydemo.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.jetpackstudydemo.R

class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.welcome_fragment, container, false)
    }

    lateinit var btnLogin: Button
    lateinit var btnRegister: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLogin = view.findViewById(R.id.btn_login)
        btnRegister = view.findViewById(R.id.btn_register)
        btnLogin.setOnClickListener {
            // 设置动画参数
            val navOption = navOptions {
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }
            // 参数设置
            val bundle = Bundle()
            bundle.putString("name","TeaOf")
            findNavController().navigate(R.id.login, bundle,navOption)
        }

        btnRegister.setOnClickListener {
            val action = WelcomeFragmentDirections
                .actionWelcomeToRegister()
                .setEmail("TeaOf1995@Gamil.com")
                .setUserName("UserName")
            findNavController().navigate(action)
        }
    }

}

