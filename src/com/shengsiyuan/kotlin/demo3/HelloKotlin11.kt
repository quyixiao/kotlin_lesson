package com.shengsiyuan.kotlin.demo3

import java.awt.event.WindowEvent
import java.awt.event.WindowListener

// 对象声明
object MyObject {
    fun method() = "hello world"
}

object MyObject2 : WindowListener {

    override fun windowDeiconified(e: WindowEvent?) {}

    override fun windowClosing(e: WindowEvent?) {}

    override fun windowClosed(e: WindowEvent?) {}

    override fun windowActivated(e: WindowEvent?) {}

    override fun windowDeactivated(e: WindowEvent?) {}

    override fun windowOpened(e: WindowEvent?) {}

    override fun windowIconified(e: WindowEvent?) {}
}
// 关于对象表达式与对象声明之间的区别
// 1.对象表达式是立刻初始化或者是执行的
// 2.对象声明是延迟初始化的，在首次访问的时候进行的
// 3.伴生对象是在其对应的类加载时初始化的，对应于Java的静态初始化

fun main(args: Array<String>) {
    println(MyObject.method())
}