package com.shengsiyuan.kotlin.demo6

/****
 *
 *
 * 带接收者了函数字面值
 *
 * kotlin 提供了这样的功能：可以通过指定接收者对象调用了一个函数字面值
 * 在函数字面值内部，你可以调用接收者的方法而无需使用任何额外的修饰符，
 *
 * 这一点非常的类似环境扩展函数
 *
 */
fun main(args: Array<String>) {

    val subtract: Int.(other: Int) -> Int = { other -> this - other }

    println(3.subtract(4))

    println("*******************************************88")

    /***
     *  匿名函数语法可以让我们指定的函数字面值接收者类型，这样，我们就可以先去声明一个带有参参数的接收者的函数类型变量，然后再去使用它
     *
     */
    val sum = fun Int.(other: Int) = this + other
    println(1.sum(4))



    println("--------------------------------")
    /***
     *  带有接收者类型的函数非字面值可以作为参数进行传递，前提是所需要接收函数的地方应该有一个接收者的类型参数，反之亦然
     *  比如说：类型 String.(Int)->Boolean 与 （String,Int） ->Boolean等价
     *
     */
    val myEquals: String.(Int) -> Boolean = { param -> this.toIntOrNull() == param }

    println("1".myEquals(1))


    println("*****************************************")
    fun myTest(op: (String, Int) -> Boolean, a: String, b: Int, c: Boolean) = println(op(a, b) == c)
    println(myTest(myEquals, "200", 200, true))


}