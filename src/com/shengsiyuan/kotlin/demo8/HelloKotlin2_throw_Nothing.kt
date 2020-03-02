package com.shengsiyuan.kotlin.demo8

// throw 在 Kotlin 中是一个表达式
// 我们可以将 throw 作为Elvis 表达式的一部分
// throw 表达式的类型是一种特殊的类型：Nothing。类型 ，这种类型
// 在自己的代码中，可以使用 Nothing 来标记永远不会返回的函数
fun myMethod(message: String): Nothing {
    throw IllegalArgumentException("值不能为空")
}

fun main(args: Array<String>) {
    var str: String? = "a"
    //val str2 = str ?: throw IllegalArgumentException("值不能为空")
    //println(str2)
    println("---------------------------------------------------")
    val str3 =
        str ?: myMethod("323232")//Elvis operator (?:) always returns the left operand of non-nullable type String?
    println(str3)
    println("--------------------------------------------")
    //Nothing? 只有唯一一个值，那么就是 null
    var s = null
    println(s is Nothing?)//智能推断 true
    println("*********************************")

    var s2 = listOf(null)
    println(s2 is Nothing?) // false
    println(s2 is List<Nothing?>) //true



}



