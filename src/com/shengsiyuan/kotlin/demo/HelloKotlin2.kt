package com.shengsiyuan.kotlin.demo

import com.shengsiyuan.kotlin.demo.mutiply as myMutiplay

fun main(args: Array<String>) {
    val a: Int = 1
    val b = 2 // final constant

    var c: Int
    c = 3
    c = 4

    var d = 3
    d = 4
    println(d)
    /***/
    //
    /**
     * /**
     * **/
     */
    // 注释是可以嵌套的
    var x = 10
    var y: Byte = 20
    x = y.toInt()
    println(x)
    //var result = mutiply(5, 4)
    var result = myMutiplay(5, 4)
    println(result)


    val m = intArrayOf(1, 2, 3)
    //m = intArrayOf(4,5)
    m.set(0, 4)
    println("${m[0] + m[1] + m[2]}")


}