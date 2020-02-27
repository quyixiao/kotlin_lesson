package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    var x = 10
    var y = 20
    var max: Int
    var min: Int
    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("max = $max , min=$min")

    var max2 = if (x > y) x else y
    println(max2)
    var min2 = if (x > y) y else x
    println(min2)

    var max3 = if (x > y) {
        print("x > y ")
        x
    } else {
        print("x < y ")
        y
    }

    var min3 = if (x > y) {
        print("x > y ")
        y
    } else {
        print("x <= y ")
        x
    }
    println("max3 = $max3 , min3=$min3")

}