package com.shengsiyuan.kotlin.demo7

// Range
fun main(args: Array<String>) {
    var i = 4
    if (i in 1..5) {
        println(i)
    }
    println("--------------------------------------")
    for (a in 1..4) {
        println(a)
    }
    println("********************************************8")

    for (a in 4 downTo  1 ){
        println(a )
    }



}