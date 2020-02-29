package com.shengsiyuan.kotlin.demo2

import kotlin.reflect.typeOf

// use-site variance(type projection) 类型投影
// 数组的浅拷贝
// 类型投影，我们只能调用from的相应的读方法，不能调用写入泛型的方法
// 使用处协变
fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in from.indices) {
        to[i] = from[i]

        // Out-projected type 'Array<out Any>' prohibits the use of
        // 'public final operator fun set(index: Int, value: T): Unit defined in kotlin.Array'
        //from [i] = 3
    }
}

fun main(args: Array<String>) {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
    val to: Array<Any> = Array(4, { "hello" + it })

    to.forEach { println(it) }
    copy(from, to)
    to.forEach { println(it) }
    println("************************************************")


    val to1: Array<Any> = Array(4, {  it })

    setValue(to1,"123",2)

    to1.forEach { println(it) }
}


fun setValue(to :Array<in String> ,value :String,index : Int){
    to[index] = value
}
