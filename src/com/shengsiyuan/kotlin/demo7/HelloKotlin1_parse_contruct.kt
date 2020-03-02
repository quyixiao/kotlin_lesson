package com.shengsiyuan.kotlin.demo7

// 解构声明
// 在一个
data class MyResult(val result: String, val status: Int)

fun myMethod(): MyResult {
    return MyResult("success", 1)
}

fun myMethod2(): Pair<String, Int> {
    return Pair("success", 1)
}

fun main(args: Array<String>) {
    val (result, status) = myMethod()
    println(result)
    println(status)

    println("**********************************")
    var (result2, status2) = myMethod2()
    println(result2)
    println(status2)


    println("----------------------------------")
    val map = mapOf("a" to "aa ", "b" to "bb", "c" to "cc")
    for ((key, value) in map) {
        println("key:${key},value:${value}")
    }

    println("------------------映射值--------------------")
    println(map.values)
    println(map.keys)
    println("------------------map test--------------------")
    map.mapValues { entry -> "${entry.value} hello" }.forEach { println(it) }

    println("------------------map test--------------------")
    map.mapValues { (key, value) -> "$value world" }.forEach { println(it) }

    println("------------------map test--------------------")
    map.mapValues { (_, value) -> "$value welcome" }.forEach { println(it) }
    println("------------------map test--------------------")
    // Kotlin 允许我们为解构声明整体的指定类型，也可以为每一个具体的 component 指定类型
    map.mapValues { (_, value): Map.Entry<String, String> -> "$value person" }.forEach { println(it) }
    println("------------------map test--------------------")

    map.mapValues { (_,value:String) -> "$value person" }.forEach { println(it)  }

}