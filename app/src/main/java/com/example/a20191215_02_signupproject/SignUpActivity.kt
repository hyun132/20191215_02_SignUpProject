package com.example.a20191215_02_signupproject

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.DatePicker
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.*

class SignUpActivity : BaseActivity() {
    var lastBackPressed = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        pwEdt.addTextChangedListener(object : TextWatcher{
//            override fun afterTextChanged(s: Editable?) {
//                Log.d("입력된값", s.toString())
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//            }
//
//        })

        birthDatTxt.setOnClickListener {
            val datePickerDialog = DatePickerDialog(mContext,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                val seletedDateStr = "${year} / ${month} / ${dayOfMonth}"
                birthDatTxt.text = seletedDateStr

            },2019,Calendar.DECEMBER,15)
//            자바에서는 월을 0~11월을 사용함. 생각하는것보다 1작은 숫자를 월로 넣어줘야함
//            Calendar 클래스의 변수를 활용해서 월을 입력하면 보기에 직관적.
            datePickerDialog.show()
        }

        pwEdt.addTextChangedListener {
            val inputStr = it.toString()
            if(inputStr.length == 0){
                pwStatusTxt.text = "비밀번호가 입력되지 않았습니다."
                pwStatusTxt.setTextColor(Color.RED)
            }else if(inputStr.length < 5 ){
                pwStatusTxt.text ="입력된 비번이 너무 짧습니다."
                pwStatusTxt.setTextColor(Color.parseColor("#FDA0EF"))
            }else{
                pwStatusTxt.text="사용해도 좋은 비밀번호입니다."
                pwStatusTxt.setTextColor(Color.GREEN)
            }
        }
    }

    override fun setValues() {

    }



}
