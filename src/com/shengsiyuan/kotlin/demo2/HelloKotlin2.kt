package com.shengsiyuan.kotlin.demo2

/****
 * 密封类（sealed class ）
 * 密封类和java中的枚举类相似
 * 一个密封类本身是可以有子类的，如果一个密封类有子类，那么，这个密封类
 * 密封类的子类是可以拥有多个子类的，每个子类的实例是有很多的
 * 强调的是父类和子类的关系，如果每一个子类，
 * 密封类的直接子类一定要一密封类定义在一个文件中，密封类的间接子类则不一定需要和密封类定义在一个文件中
 *****/

sealed class Calculator

class Add : Calculator()

class Subtract : Calculator()

class Multiply : Calculator()

fun calculate(a: Int, b: Int, cal: Calculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
    println(calculate(6, 2, Multiply()))
}




