package com.shengsiyuan.kotlin.demo


class Student(private val username: String, private val age: Int, private var address: String) {


    fun printStudentInfo() {
        println("username:${username} , age :${age},address :${address}")
    }

}

/**
 * 如果构造方法有注解或者可见性修饰符，那么constructor关键字就是不能省略掉了的，并且它的修饰符的后面
 *
 */
class Student2 private constructor(username: String) {

}

// 这里表示传递的值就是默认的值
// 在JVM 上，如果类的primary构造方法所有的参数都拥有默认值，那么kotlin编译就会为这个类生成一个不带参数的构造方法
// 这个不带参数的构造方法会使用这些参数的默认值，这样做的上的在于可以跟Spring等框架更好的集成

class Student3(var username: String = "zhangsan") {
    fun a() {
        println("${username}")
    }

}

fun main(args: Array<String>) {
    val student = Student("zhaang", 20, "sehngzheng")
    student.printStudentInfo()


    var student3 = Student3()
    student3.a()


    var student4 = Student3("lisi")
    student4.a()


}