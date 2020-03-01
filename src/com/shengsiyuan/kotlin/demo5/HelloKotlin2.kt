package com.shengsiyuan.kotlin.demo5

// Unit 表示这个函数是不返回值的
fun myPrint(name: String): Unit {
    println(name)
    return Unit // Unit 是一个关键字吗？ Unit 是一个对象，这个类型对应于 java的 void  类型，
}


fun add(a: Int, b: Int): Int {
    return a + b
}


// 单表达式函数，函数的返回类型如果可以通过类型推断出来，那么返回类型就可以省略掉
/***
 *  显示 返回类型：
 *  拥有方体的函数需要显示指定返回类型,除非函数返回 Unit,这时返回类型就可以省略掉，
 *  Kotlin 并不会推断拥有块体的函数返回类型，因为这种函数可有拥有非常复杂的控制流程
 *  返回类型对于阅读代码的人来说不是那么明显了，（有时，对于编译器来说也是如此）
 *
 */


/****
 * 一个方法中，只允许一个参数为 vararg,通常作为最后一个参数，如果 vararg 不是最后的一个参数，那么其后的参数就需要通过具名参数进行
 * 传递，
 *
 */


fun <T> convert2List(vararg elements: T): List<T> {
    val result = ArrayList<T>()
    elements.forEach { result.add(it) }
    return result
}

fun main(args: Array<String>) {
    println(convert2List("hello","world","hello world"))
    var elements = arrayOf("welcome","bye","test")
    println(convert2List("zhangsangf","lisi",*elements))
}