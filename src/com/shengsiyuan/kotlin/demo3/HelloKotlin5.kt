package com.shengsiyuan.kotlin.demo3

class OuterClass5 {
    inner class InnerClass5(str:String){
        init {
            println(str)
        }
    }
}

fun main(args: Array<String>) {
    var innerClass5:OuterClass5.InnerClass5 = OuterClass5().InnerClass5("xxxx")

}