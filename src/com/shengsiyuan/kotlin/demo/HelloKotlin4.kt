package com.shengsiyuan.kotlin.demo

fun main(args: Array<String>) {
    println(convert2Int("ab"))
}


fun convert2Int(str: String): Int? { //Int 加一个？表示结果可能为空
    try {
        return str.toInt()
    } catch (e: Exception) {

    } finally {

    }
    return null
}

