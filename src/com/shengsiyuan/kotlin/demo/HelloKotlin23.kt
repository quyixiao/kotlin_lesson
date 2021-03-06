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


class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo(i: Int) {
    println("member2")
}

fun Any?.toString(): String {
    if (null == this) {//如果这个类型本身是空的话，则直接返回一个"null"字符串
        return "null"
    }
    return toString()
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
    println("---------------------------------------")
    CC().foo()//如果一个类有一个方法，进行扩展，方法名是一样的，那么原有定义的方法会覆盖现在的方法
    CC().foo(2)

}


