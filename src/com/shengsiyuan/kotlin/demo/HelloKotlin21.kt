package com.shengsiyuan.kotlin.demo

class TheClass{
    // Property must be initialized or be abstrac
    // 如果定义 abstract  Property getter or setter expected
    // 如果一个属性被 lateinit 修饰以后，编译器就不会去检测有没有赋值了
    lateinit var  name :String
    fun init(){
        this.name = "zhangsan"
    }
    fun myPrint(){
        println(this.name)
    }

}

fun main() {
    var theClass = TheClass()
    theClass.init()
    theClass.myPrint()

}