package com.shengsiyuan.kotlin.demo

// 可见性，visibility
// Kotlin提供了4种可见性的修饰符:private,protected,internal,public
// protected 是不能用在顶层的函数中，或者顶层的方法中
//
fun method() {

}

//如果没有加任何的修饰符是public
class Clazz

// 在类里拥有的属性和方法
class Clazzl {

}


open class Clazz11 {
    private val b = 3
    protected open val c = 4
    internal val d = 5
    public val f = 6

}


class subClazz : Clazz11() {
    fun printMy() {
        println(c)
        println(d)
        println(f)
        //println(b) 这个是不能用的
    }
}


class Clazz2 {

}


