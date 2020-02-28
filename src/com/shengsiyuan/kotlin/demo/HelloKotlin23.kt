package com.shengsiyuan.kotlin.demo

// 扩展：extension
// 方法扩展

class TextensionTest {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
}

fun TextensionTest.multiply(a: Int, b: Int) = a * b

fun main(args: Array<String>) {
    var extensionTest = TextensionTest()
    println(extensionTest.add(1, 2))
    println(extensionTest.sub(3, 2))
    println(extensionTest.multiply(3, 4))// 在不使用新的方法的情况下
}

