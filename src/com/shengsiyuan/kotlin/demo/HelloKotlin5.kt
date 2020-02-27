package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    println(convert2Uppercase("HelloWord"))
    println(convert2Uppercase(23))
}


fun convert2Uppercase(str: Any): String? {
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}



