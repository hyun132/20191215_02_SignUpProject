package com.example.a20191215_02_signupproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.a20191215_02_signupproject.R
import com.example.a20191215_02_signupproject.datas.Alcohol

class AlcoholAdapter(context: Context, resId : Int, list : ArrayList<Alcohol>) : ArrayAdapter<Alcohol>(context, resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.alcohol_spinner_list_item,null)
        }

        val row = tempRow!!
        val data = mList.get(position)
        val alcoholBrandNameTxt = row.findViewById<TextView>(R.id.alcoholBrandnameTxt)
        val alcoholTypeTxt = row.findViewById<TextView>(R.id.alcoholTypeTxt)

        alcoholBrandNameTxt.text =data.brandName
        alcoholTypeTxt.text = data.type

        return row
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.alcohol_spinner_dropdown_list_item,null)
        }

        val row = tempRow!!
        val data = mList.get(position)
        val alcoholBrandNameTxt = row.findViewById<TextView>(R.id.alcoholBrandnameTxt)
        val alcoholTypeTxt = row.findViewById<TextView>(R.id.alcoholTypeTxt)

        alcoholBrandNameTxt.text =data.brandName
        alcoholTypeTxt.text = "${data.type}"

        return row
    }

}