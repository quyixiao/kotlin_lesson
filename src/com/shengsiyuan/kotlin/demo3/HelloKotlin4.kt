package com.shengsiyuan.kotlin.demo3

class OuterClass4 {
    class NestedClass4 {
        init {
            println("NestedClass4 构造块执行")
        }
    }




}


fun main(args: Array<String>) {
    var nestedClass4:OuterClass4.NestedClass4 = OuterClass4.NestedClass4()

}