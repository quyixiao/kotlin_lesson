package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    var array = listOf<String>("hello", "world", "hello world", "welcome", "goodbyte")
    for (item in array) {
        println(item)
    }
    println("=================================")
    if ("world" in array) {
        println("world in array")
    }

    println("=================================")
    when {
        "world" in array -> println("world in array")
    }
    // 1 找出长度大于5的元素
    // 2.将符合条件转换成大写
    // 3.排序
    // 4.输出到控制台上
    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }



}