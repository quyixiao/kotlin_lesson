package com.shengsiyuan.kotlin.demo5

/***
 * 内联函数（inline function）
 *  如果一个方法去调用了b,
 *
 ***/

//inline  表示这个函数或者方法是一个内联函数
inline fun myCalculate(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    println(myCalculate(1, 2))
}





