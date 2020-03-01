package com.shengsiyuan.kotlin.demo4

import kotlin.reflect.KProperty

// 委托属性（delegated property ）
// 有4种情况在实际开发中比较有用
// 1.延迟属性
// 2.可观属性
// 3.对属性的操作进行比较细粒度的控制,非空属性
// 4.map属性，


class MyDelegate {
    // 必需要写成getValue,setValue的值
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String =
        "$thisRef,you delegate property name is ${property.name}"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) =
        println("$thisRef ,new value is $value")
}

class MyPropertyClass {
    var str: String by MyDelegate()


}

fun main(args: Array<String>) {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}