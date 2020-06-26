package com.example.jetpackstudydemo.viewmodel

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.databinding.ObservableField
import com.example.jetpackstudydemo.ui.activity.TabActivity

class LoginModel constructor(name: String, pwd: String, context: Context) {
    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)
    var context: Context = context
    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(s: CharSequence) {
        n.set(s.toString())
    }

    /**
     * 密码改变的回调函数
     */
    fun onPwdChanged(s: CharSequence) {
        p.set(s.toString())
    }

    fun login() {
        if (!n.get().equals("")
            && !p.get().equals("")
        ) {
            var name : String = n.get().toString();
            var pwd : String = p.get().toString();

            Toast.makeText(context, "账号密码正确 账号： $name 密码： $pwd", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, TabActivity::class.java)
            context.startActivity(intent)
        }
    }
}