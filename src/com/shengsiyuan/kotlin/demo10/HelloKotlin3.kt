package com.shengsiyuan.kotlin.demo10

fun main(args: Array<String>) {
    val myVarargs = MyVarargs()
    val stringArray = arrayOf("hello", "world", "hello world")
    myVarargs.myMethod(*stringArray) // spread operation ,将数组分散打散的程序

}