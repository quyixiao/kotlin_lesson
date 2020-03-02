package com.shengsiyuan.kotlin.demo7


fun main(args: Array<String>) {
    val items = listOf(1, 2, 3, 4)
    println(items.first())
    println(items.last())
    items.filter { it % 2 == 0 }.forEach { println(it) }
    println("***********************************")
    val myList = mutableListOf(1, 2, 3)
    println(myList.requireNoNulls())
    if (myList.none() { it > 10 }) {
        println("没有大于10的元素")
    }


    println(myList.firstOrNull())
    println(myList.lastOrNull())
    println("-------------------------------------")
    val myMap = hashMapOf("hello" to 1, "world" to 2)
    println(myMap["hello"])
    println("-0--------------------------------")
    val myMap2 :Map<String,Int> = HashMap(myMap)
    println(myMap2)
    println("==============2222===================")//得到 mymap2



}