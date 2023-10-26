package com.example.calculator

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.DecimalFormat

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {

//    val str = "8,56"
//    val decimalFormat = DecimalFormat("#.######")
//    val number = decimalFormat.parse(str)!!.toDouble()
//    println(number::class.java.typeName)

    val list:MutableList<String> = mutableListOf("7","-","2")
    list.forEach {
        when(it){
            "-"-> println(list.indexOf(it))
        }
    }

}

