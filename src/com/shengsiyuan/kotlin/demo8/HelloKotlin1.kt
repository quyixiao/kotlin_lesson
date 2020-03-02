package com.shengsiyuan.kotlin.demo8

import java.lang.Integer.parseInt

// 异常，kotlin 中的 try 是一个表达式
// Kotlin 中没有 checked exception 的
fun main(args: Array<String>) {
    val s = "a"
    val result: Int? = try {
        parseInt(s)
    } catch (e: Exception) {//如果抛出异常，则异常中的最后的一个表达式为返回值
        null
    } finally {
        println("finally invoke ")
    }
    println(result)

}