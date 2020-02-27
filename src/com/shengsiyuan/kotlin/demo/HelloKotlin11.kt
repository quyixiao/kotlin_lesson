package com.shengsiyuan.kotlin.demo

class EmptyClass

// 在Kotlin中，一个类可以用一个primary构造方法及一个或多个secondary构造方法
// primary 构造方法是类头的一部分（class header ）的一部分，它位于类名的后面，可以拥有若干参数
// 如果primary构造方法没有任何注解或者是可见性关键字修饰，那么constructor关键字可省略
//class MyClass constructor(username: String) {// 这个称为是主构造方法
//

class MyClass(username: String) {
    private val username: String = username.toUpperCase()

    init { // 这个是初始化代码块的，是直接使用构造方法的
        println(username)//主构造方法是可以直接调用构造参数的
    }

}


fun main(args: Array<String>) {
    var myClass = MyClass("zhangsan")


}
