package com.shengsiyuan.kotlin.demo10

fun main(args: Array<String>) {
    val myException = MyException111()
    println("==========================")
    val clazz = MyException111()::class.java
    println(clazz)
    println("---------------------------------------------")
    println(MyException111().javaClass)//得到的是一个 class 对象



}