package com.shengsiyuan.kotlin.demo5

/***
 *
 */
fun main(args: Array<String>) {
    val strings = arrayOf("hello", "world", "helloWorld", "welcome")
    strings.filter { it.contains("h") }.forEach { println(it) }
    println("*****************************************")
    strings.filter { it.length > 7 }.forEach { println(it) }
    println("-----------------------------------------------")
    strings.filter { it.endsWith("D", ignoreCase = true) }.map { it.toUpperCase() }.forEach { println(it) }

}