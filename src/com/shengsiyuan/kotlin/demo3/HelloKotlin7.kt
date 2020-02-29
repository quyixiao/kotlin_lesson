package com.shengsiyuan.kotlin.demo3

/****
 * 匿名对象只能在局部变量范围内或者是被private修饰的成员变量范围内才能被其识别出真正的类型.
 * 如果将匿名对象当做一个public方法返回类型或者public属性的类型，那么该方法或者属性真正的类型
 * 就是该匿名对象声明的父类型，如果没有声明任何父类型，那么其类型就是Any,在这种情况下，或者对象中所声明的任何成员都是无法访问的
 *
 *
 */
class MyClass {
    // 一定要加上修饰符private , Unresolved reference: output
    private var myObject = object {
        fun output() {
            println("output invoked ")
        }
    }


    private var xxx = object {
        fun output() {
            println("output invoked ")
        }
    }

    fun myTest() {
        println(myObject.javaClass)
        println(xxx.javaClass)
        myObject.output()
    }
}

class MyClass2{
    private fun method1()=object{
        var str = "hello"
    }

    internal fun method2() = object {
        var str = "world"
    }

    fun test(){
        var str = method1().str
        //var str2 = method2.str 不存在
    }
    
}

fun main(args: Array<String>) {
    var myClass = MyClass()
    myClass.myTest()
}