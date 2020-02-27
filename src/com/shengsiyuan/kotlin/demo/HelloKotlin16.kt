package com.shengsiyuan.kotlin.demo

open class MyParent {
    open var name: String = "parent"
}


class MyChild : MyParent() {
    override var name: String = "child" //如果是重写的话，一定要加上override
}


class MyChild2(override var name: String) : MyParent() {

}
// 1.val 是可以override val
// 2.var 是可以override val
// 3.val 是不可以override var
// 本质上,val是相当的get方法，var相当于get与set方法
open class MyParent3 {
    open fun method() {
        println("parent method")
    }

    open val name: String get() = "parent"
}


class MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }


    override val name: String
        get() = super.name + " and child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)
    println("============================")

    var myChild3 = MyChild3()
    myChild3.method()
    println(myChild3.name)



}