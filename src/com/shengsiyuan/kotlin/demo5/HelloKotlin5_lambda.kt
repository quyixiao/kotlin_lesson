package com.shengsiyuan.kotlin.demo5

/***
 * 高阶函数（high-order function） 与 lambda
 *  将一个函数返回，或者接收一个函数
 *  Lambda 表达式格式要求
 *  1. 一个 lambda 表达式总是被一对花括号包围
 *  2. 其参数（如果有的话）位于->之前（参数类型是可以省略掉的）
 *  3. 执行体位于->之后
 *  在 Kotlin 中，如果一个函数的最后一个参数是个函数，那么可以将 lambda 表达式作为实际参数传递进去
 *  并且可以在调用方法圆括号外去使用
 **/

val multiply: (Int, Int) -> Int = { a, b -> a * b }
val add: (Int, Int) -> Int = { a, b -> a + b }
val substract = { a: Int, b: Int -> a - b }
val myAction = { println("hello world") }
val myRetrunNull: (Int, Int) -> Int? = { _, _ -> null }
val functionMaybeNull: ((Int, Int) -> Int)? = null //整个函数类型都可能为空



fun main(args: Array<String>) {
    myAction()

}






