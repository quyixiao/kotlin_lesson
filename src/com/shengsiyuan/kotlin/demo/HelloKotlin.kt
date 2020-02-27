package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    println(sum(5, 6))
    println(sum2(6, 10))
    myPrint(2, 3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun myPrint(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}


