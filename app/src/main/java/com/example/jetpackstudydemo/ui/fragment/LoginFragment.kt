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
import androidx.fragment.app.Fragment
import com.example.jetpackstudydemo.R
import com.example.jetpackstudydemo.ui.activity.TabActivity

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    lateinit var user : EditText
    lateinit var password : EditText
    lateinit var login : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        user = view.findViewById(R.id.et_account);
        password= view.findViewById(R.id.et_pwd);
        login= view.findViewById(R.id.btn_login);

        val string = arguments?.getString("name")
        user.setText(string)

        login.setOnClickListener {
            val userName : String = user.text.toString();
            val userPwd : String = password.text.toString();
            Log.d("LoginFragment", "点击了登录按钮 $userName $userPwd");

            val intent = Intent(context, TabActivity::class.java)
            context!!.startActivity(intent)
            Toast.makeText(context, "登录成功！", Toast.LENGTH_SHORT).show()

        }

    }
}


