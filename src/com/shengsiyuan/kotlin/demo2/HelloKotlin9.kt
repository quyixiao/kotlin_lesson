package com.shengsiyuan.kotlin.demo2



// 泛型函数
// 语法表示形式上表现出哪些不同，kotlin 语言设计上表现出不一样的东西，对自己的技术点做出了升华
fun <T> getValue(item :T) :T {
    return item
}

class UpperBoundsClass<T:List<T>> {

}

// 泛型类型的上界，多个泛型类型的上界
class UpperBundsClass2<T> where T:Comparable<T>,T:Any{

}

fun main(args: Array<String>) {
    val item = getValue(3)
    println(item)

    val item2 = getValue("hello")
    println(item2)

    val upperBunds = UpperBundsClass2<String>()

}