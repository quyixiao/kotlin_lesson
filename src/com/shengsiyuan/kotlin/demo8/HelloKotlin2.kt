package com.shengsiyuan.kotlin.demo8

// throw 在 Kotlin 中是一个表达式
// 我们可以将 throw 作为Elvis 表达式的一部分
// throw 表达式的类型是一种特殊的类型：Nothing。类型 ，这种类型
//
fun main(args: Array<String>) {
    var str: String?= "a"
    val str2 = str ?: throw IllegalArgumentException("值不能为空")
    println(str2)




}