package com.shengsiyuan.kotlin.demo

// 扩展作用域
/***
 * 1. 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
 * 2. 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receviver）
 * 3. 当以上两个名字出现冲突时，扩展接收都的优先级最高
 *
 */

class DD {
    fun method() {
        println("DD method")
    }
}




