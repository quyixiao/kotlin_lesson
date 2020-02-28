package com.shengsiyuan.kotlin.demo

/***
 * 延迟初始化属性
 * Kotlin要求非空类型的属性必需要在构造方法中进行初始化的
 * 有时，这种要求不太方便，比如可以通过命令注入或者单元测试的情况下进行属性的赋值
 * 通过lateinit关键字标识属性为延迟初始化，需要满足如下3个条件
 * 1.lateinit只能用在类体中声明的var属性上，不能用在primary constructor声明属性上
 * 2.属性不能拥有自定义的set与geter
 * 3.属性类型需要非空，且不能是原生的数据类型
 *
 */
class TheClass {
    // Property must be initialized or be abstrac
    // 如果定义 abstract  Property getter or setter expected
    // 如果一个属性被 lateinit 修饰以后，编译器就不会去检测有没有赋值了
    lateinit var name: String

    fun init() {
        this.name = "zhangsan"
    }

    fun myPrint() {
        println(this.name)
    }
}

fun main() {
    var theClass = TheClass()
    theClass.init()
    theClass.myPrint()
}