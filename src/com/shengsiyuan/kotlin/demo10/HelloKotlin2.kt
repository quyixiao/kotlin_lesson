package com.shengsiyuan.kotlin.demo10

/****
 *  数组
 *  Kotlin 中的数组是不可变的（相对于 协变与逆变来说） 这一点与 java 存在明显的不同
 *  这意味着，我们无法将一个 Array<String> 赋值给 Array<Any> ，这样就可以防止可能出现的运行期异常
 *  在 java中原生类型的数组
 *
 *  Kotlin 提供了原生类型的数组来避免自动装箱与拆箱带来的成本，IntArray,DoubleArray,CharArray...
 * 当编译成 jvm
 *
 **/

fun main(args: Array<String>) {
    var myArray = MyArray()
    val intArray = intArrayOf(1, 2, 3, 4)
    val a: Array<Int> = arrayOf(1, 2)
    myArray.myArrayMethod(intArray).forEach { println(it) }
    println("--------------")

    // 当编译成 jvm 字节码的时候，编译器会优化于参数组的访问，使之不会产生额外的成本

    val array = arrayOf(1,2,3,4)
    array[0] = array[0] * 2 // 并不会调用 set 或者是 get 方法
    array.forEach { println(it) }
    println("====================================================")
    // 允许将此类型的数组，不得不做的一件事情
    for (x in array){
        println(x)
    }






}


