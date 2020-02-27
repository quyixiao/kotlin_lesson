package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    var a = 5
    val b = 10

    if (a in 2..b) {
        println("in the range")
    }
    if (a !in 2..b) {
        println(" out of range ")
    }
    println("==============================")
    for (i in 2..10) {
        println(i)
    }
    println("==============================")
    for (i in 2.rangeTo(10)) {
        println(i)
    }
    println("==============================")
    for (i in 2..10 step 3) {
        println(i)
    }

}