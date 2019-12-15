package com.example.a20191215_02_signupproject

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    val mContext = this

    abstract fun setupEvent()
    abstract fun setValue()

}