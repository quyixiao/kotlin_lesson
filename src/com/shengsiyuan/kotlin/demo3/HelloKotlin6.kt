package com.shengsiyuan.kotlin.demo3

// 对象表达式（object expression）
// java中匿名内部类在很多的场景下都得到了大量的使用
// Kotlin的对象表达式就是为了解决匿名内部类的一些缺陷而产生的
/***
 * 1.匿名内部类是没有名字的类
 * 2.匿名内部类一定是继承了某个父类，或者实现了某个接口
 * 3.Java运行时会将该匿名内部类当做它的实现了接口或者所继承的父类来看待
 * object[:若干个父类，中间用逗号分隔]
 *
 */


interface MyInterface{
    fun myPrint(i:Int);
}

abstract class MyAbstractClass{
    abstract val age:Int
    abstract fun printMyAbstractClassInfo()
}


fun main(args: Array<String>) {
    var myObject = object :MyInterface{
        override fun myPrint(i:Int){
            println("i的值是$i")
        }
    }
    myObject.myPrint(10)


    println("---------------------------")
    var myObject2 = object {
        init {
            println("myObject2 初始化执行")
        }
        var myProperty = "hello world"
        fun myMethod () = "myMethod()"

    }
    println("**********************************")
    println(myObject2.myProperty)
    println(myObject2.myMethod())


    var myObject3 = object :MyInterface,MyAbstractClass(){

        override fun myPrint(i: Int) {
            println("=======================")
        }

        override val age: Int
            get() = 10

        override fun printMyAbstractClassInfo() {
            println("printMyAbstractClassInfo")
        }

    }
    println("*****************************11111111111111111111************")
    println(myObject3.age)
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    println(myObject3.printMyAbstractClassInfo())
    println("|||||||||||||||||||||||||||||||||||||||||||")
    println(myObject3.myPrint(10))

}