package com.shengsiyuan.kotlin.demo12

fun List<String>.myFilter(): List<String> {
    return listOf("hello", "world")

}


@JvmName("myFilter2")
fun List<Int>.myFilter(): List<Int> {
    return listOf(1, 2)
}

fun main(args: Array<String>) {


    val list = listOf<String>()
    println(list.myFilter())

    val lis2 = listOf<Int>()
    println(lis2.myFilter())


}