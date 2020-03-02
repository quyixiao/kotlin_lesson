package com.shengsiyuan.kotlin.demo10

fun main(args: Array<String>) {
    val myException = MyException()
    println("==========================")
    val clazz = MyException()::class.java
    println(clazz)
    println("---------------------------------------------")
    println(MyException().javaClass)//得到的是一个 class 对象



}