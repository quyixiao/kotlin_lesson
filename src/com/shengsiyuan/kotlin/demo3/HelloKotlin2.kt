package com.shengsiyuan.kotlin.demo3

//内部类(Inner Class)
/***
 *  关于嵌套类与内部类之间的区别与联系：
 *      1.嵌套类：对应于Java的静态内部类（即有static关键字修改的内部类），只要在一个类的内部定义了另一个类，那么这个类
 *      就叫做嵌套类，相当于Java当中有static关键字修改的内部类
 *      2.内部类：对应于java中的非静态内部类，即没有static关键字修改的内部类，使用inner关键字在一类内部所定义的另外一个类
 *      就叫做内部类，相当于Java中没有static关键字修改的内部类
 *      我觉得这个还是很好的，但是不是这样子的，所以，不要
 *
 */
class OuterClass2 {
    private var str: String = "hello world"

    inner class InnerClass {
        //明确的定义当前的类是内部类
        fun innerMethod() = this@OuterClass2.str
    }

    // 局部嵌套类
    fun getName(): String? {
        class LocalNestedClass {
            val name: String = "mytest"
        }

        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}

//
fun main(args: Array<String>) {
    //需要创建一个实例
    println(OuterClass2().InnerClass().innerMethod())
    println(OuterClass2().getName())
}






