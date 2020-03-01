package com.shengsiyuan.kotlin.demo5

/****
        中缀符号（infix notation）
1.是成员函数或者是扩展函数
 2.拥有单个参数
 3.声明时使用 infix 关键字

        ***/


class InfixTest(private var a :Int){
    infix fun add(b:Int) = this.a + b
}


fun main(args: Array<String>) {
    var fixTest = InfixTest(2)
    println(fixTest.add(5))
    println(fixTest add 5 )
}