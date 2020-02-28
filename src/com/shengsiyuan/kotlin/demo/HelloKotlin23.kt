package com.shengsiyuan.kotlin.demo

// 扩展：extension
// 方法扩展

class TextensionTest {
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
}

fun TextensionTest.multiply(a: Int, b: Int) = a * b


// 扩展函数的解析是静态的
/***
1.扩展本身并不会真正的修改目标类，也就是说它并不会在目标类中插入新的属性或方法
2.扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
3.在Spring里面我们是非常的用得多的，就是动态绑定
4.调用是由对象声明类型所决定的，而不是由对象的实际类型决定的
 */

open class AA
class BB : AA()
fun AA.a() = "a"
fun BB.a() = "b"

fun myPrintxxxx(aa: AA) {
    println(aa.a())
}

fun main(args: Array<String>) {
    var extensionTest = TextensionTest()
    println(extensionTest.add(1, 2))
    println(extensionTest.sub(3, 2))
    println(extensionTest.multiply(3, 4))// 在不使用新的方法的情况下
    println("************************************")

    var a = AA()
    var b = BB()
    println(a.a())
    println(b.a())
    println("---------------------------------------")
    myPrintxxxx(a)
    myPrintxxxx(b)//打印结果是a
}