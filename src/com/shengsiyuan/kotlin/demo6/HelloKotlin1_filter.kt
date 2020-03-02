package com.shengsiyuan.kotlin.demo6


/***
 * 在默认的情况下，lambda 表达式中最后一个表达式的值会隐式的作为该lambda 表达式的返回值
 * 我们可以通过全限定的 return 语法来显示从 lambda 表达式的返回值
 */

fun main(args: Array<String>) {
    val strings = arrayOf("hello", "world", "byte")
    strings.filter {
        val mayFileter = it.length > 3
        mayFileter
    }.forEach { println(it) }
    println("*************************************")
    strings.filter {
        val mayFilter = it.length > 3
        return@filter mayFilter
    }.forEach { println(it) }
    println("*************************************")
}


