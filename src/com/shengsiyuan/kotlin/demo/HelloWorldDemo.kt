package com.shengsiyuan.kotlin.demo

import java.util.function.Consumer


fun main(args: Array<String>) {
    val list: List<String> = listOf("hello", "word", "hello word")
    for (str in list) {
        println(str)
    }
    println("****************************************")
    list.forEach(Consumer { println(it) })
    println("****************************************")
    list.forEach(System.out::println)

}
