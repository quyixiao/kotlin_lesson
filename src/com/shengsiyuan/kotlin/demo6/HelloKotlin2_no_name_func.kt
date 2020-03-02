package com.shengsiyuan.kotlin.demo6


/***
 * 匿名函数
 * 匿名函数是没有函数名称的，匿名函数是表达式
 *
 ***/

fun main(args: Array<String>) {
    var a = fun(x: Int, y: Int) = x + y

    var b = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(a(1, 2))
    println(b(3, 4))
    val strings = arrayOf("hello", "world", "bye")
    strings.filter(fun(item): Boolean = item.length > 3).forEach(fun(item) = println(item))
    strings.filter { it.length > 3 }.forEach { println(it) }
    println("********************************************")


}


