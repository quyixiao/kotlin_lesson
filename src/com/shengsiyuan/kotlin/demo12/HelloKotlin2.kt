package com.shengsiyuan.kotlin.demo12


class MyClass {
    val a: Int
        @JvmName("getAValue")
        get() = 20

    fun getA() = 30

}


fun main(args: Array<String>) {
    var myClass = MyClass()

    println(myClass.getA())
    println(myClass.a)//如果访问属性，直接点属性就好了

}