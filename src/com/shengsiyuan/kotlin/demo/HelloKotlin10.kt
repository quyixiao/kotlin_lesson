package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    var a: String = "hello \n world"
    println(a)
    var b: String = """hello
        | \n
            | """.trimMargin()

    println(b)
}