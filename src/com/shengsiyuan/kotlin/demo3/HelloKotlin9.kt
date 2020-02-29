package com.shengsiyuan.kotlin.demo3

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame


/***
 * Kotlin 中的对象表达式是为了替换java中的匿名内部类的
 ***/


fun main(args: Array<String>) {

    val jFrame = JFrame("My JFRAME")
    val jButton = JButton("my button")

    jFrame.addWindowListener(object : WindowListener {
        override fun windowDeiconified(e: WindowEvent?) {
            println("windowDeiconified")
        }

        override fun windowClosing(e: WindowEvent?) {
            println("windowClosing")
        }

        override fun windowClosed(e: WindowEvent?) {
            println("windowClosed")
        }

        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
        }

        override fun windowDeactivated(e: WindowEvent?) {
            println("windowDeactivated")
        }

        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowIconified(e: WindowEvent?) {
            println("windowIconified")
        }


    })


    /*jButton.addActionListener(object :ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("button Press")
        }
    })
*/
    jButton.addActionListener { println("Button pressed ") }


    val listener = ActionListener { println("hello world") }

    println(listener.javaClass)
    println(listener.javaClass.superclass)
    println(listener::class.java)
    println(listener::class.java.superclass)

    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE


}