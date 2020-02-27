package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {

    var array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    for (item in array) {
        println(item)
    }
    println("===========================================")
    for (i in array.indices) {//拿到每一个元素的下标
        println("Array[$i] = ${array[i]}")
    }
    println("===========================================")
    for ((index, value) in array.withIndex()) {
        println("Array[$index] = ${value}")
    }

}

