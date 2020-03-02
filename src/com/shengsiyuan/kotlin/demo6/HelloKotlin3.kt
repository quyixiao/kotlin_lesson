package com.shengsiyuan.kotlin.demo6

/***
 * 闭包
 * */


fun main(args: Array<String>) {
    var sum = ""
    val strings = arrayOf("hello", "world", "bye")
    // 在 lambda 表达式中能够访问外层的变量，还能够修改他
    strings.filter { it.length > 3 }.forEach { sum += it }
    println(sum)


}