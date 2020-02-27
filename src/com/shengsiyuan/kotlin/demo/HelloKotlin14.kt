package com.shengsiyuan.kotlin.demo

// 在Kotlin中，所有的类在默认的情况下都是无法被继承的
// 换名话来说，在Kotlin中，所有的类默认的情况下都是final
// open 表示可以继承的，open 的含义是与final相反的
open class Parent(name: String, age: Int) {

}

// Child 是不能被继承的，因为本身不是open类
class Child(name: String, age: Int) : Parent(name, age) {

}

//
open class Parent2(name: String) {

}

// 在Kotlin中，如果一个类没有primary构造方法，那么这个类的每个secondary构造方法就需要通过
// super关键字来初始化父类型，或者通过其他的secondary构造方法来完成这个任务
// 不同的secondary构造方法可以调用父类型的不同的构造方法
//
class Child2 : Parent2 {
    constructor(name: String) : super(name) {

    }
}