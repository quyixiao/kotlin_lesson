package com.shengsiyuan.kotlin.demo

open class Fruit {
    open fun name() {
        println("fruit")
    }

    fun expirationDate() {
        println("1 month")
    }
}

// 如果一个子类重写了父类的方法，需要使用overrade ，显示的指定override,同时父类的方法必需加上open 关键字
class Apple : Fruit() {
    override fun name() {
        println("appele")
    }
}

class Orange : Fruit() {
    final override fun name() {
        println("orange")
    }
}


fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.expirationDate()
}
