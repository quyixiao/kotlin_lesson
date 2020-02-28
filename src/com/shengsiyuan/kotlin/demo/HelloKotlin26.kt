package com.shengsiyuan.kotlin.demo

// 扩展作用域
/***
 * 1. 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
 * 2. 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receviver）
 * 3. 当以上两个名字出现冲突时，扩展接收(DD)都的优先级最高
 *
 */

class DD {
    fun method() {
        println("DD method")
    }
}




class EE{
    fun method2(){
        println("EE method")
    }
    fun DD.hello(){
        println(" ee dd hello")
        method() // 即使在另个类中
        method2()
    }

    fun world(dd:DD){
        dd.hello()
    }

    fun DD.output(){
        println(toString())//调用dd的toString
        println(this@EE.toString())//调用ee的toString
    }

    fun test(){
        var dd = DD()
        dd.output()
    }
}

fun main(args: Array<String>) {
    var ee = EE()
    ee.method2()

    println("**********************************")
    var dd = DD()
    ee.world(dd)

    println("**********************************")
    ee.test()

}