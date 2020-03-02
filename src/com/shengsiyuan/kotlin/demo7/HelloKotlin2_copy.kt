package com.shengsiyuan.kotlin.demo7

/***
 * Kotlin 严格区分可变集合与不可变集合
 * 要清楚一点的是，区分不可变
 */
fun main(args: Array<String>) {

    var stringList: MutableList<String> = mutableListOf("hello", "world", "hello world")
    val readOnlyView = stringList

    println(stringList)
    stringList.add("welcome")
    println(readOnlyView)

    println("************************************8")
    // 只读类型是协变的，因为它们只用于集合中获取数据，而不会修改集合中的数据
    val strings: HashSet<String> = hashSetOf("a", "b", "c", "d")
    println(strings.size)
    println("----------------------------------------")
    val s = listOf("a", "b")
    val s2: List<Any> = s
    println("------------------------------")
    // 快照
    // toList 扩展方法中是复制原来的集合元素，所以返回的集合就可以确保不会发生改变了
    //
    val items = mutableListOf("a", "b", "c")
    val items2 = items.toList()
    items.add("d")
    println(items)
    println(items2)


}