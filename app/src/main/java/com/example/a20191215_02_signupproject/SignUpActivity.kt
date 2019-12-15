package com.example.a20191215_02_signupproject

import android.os.Bundle

class SignUpActivity : BaseActivity() {
    var lastBackPressed = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    override fun setupEvent() {

        lastBackPressed = 10L
    }

    override fun setValue() {

    }



}
