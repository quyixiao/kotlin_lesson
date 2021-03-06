package com.shengsiyuan.kotlin.demo3

/****
 * 类似于Java匿名内部类，Kotlin对象表达式中的代码是可以访问到外层的变量的
 * 与java不同的是，外层变量无需声明为final
 *
        ***/


fun main(args: Array<String>) {
    var i = 100
    var myObject = object{
        fun myMethod(){
            i ++
        }
    }

    myObject.myMethod()
    myObject.myMethod()
    myObject.myMethod()

    println(i)

}