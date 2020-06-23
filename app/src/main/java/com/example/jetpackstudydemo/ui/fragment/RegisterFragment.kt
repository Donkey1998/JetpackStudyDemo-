package com.example.jetpackstudydemo.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.jetpackstudydemo.R

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.register_fragment, container, false)
    }

    lateinit var email : EditText
    lateinit var user: EditText
    lateinit var password : EditText
    lateinit var register : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        email = view.findViewById(R.id.et_email)
        user = view.findViewById(R.id.et_account)
        password= view.findViewById(R.id.et_pwd)
        register= view.findViewById(R.id.btn_login)
        register.setOnClickListener {
            val emailAddress :String = email.text.toString()
            val userName : String = user.text.toString();
            val userPwd : String = password.text.toString();
            Log.d("RegisterFragment", "点击了登录按钮 $emailAddress $userName $userPwd");
        }
    }

}