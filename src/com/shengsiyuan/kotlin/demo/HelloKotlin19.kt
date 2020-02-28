package com.shengsiyuan.kotlin.demo


// object declaration 对象声明
// 面向对象的class 类，一定通过new关键字


object MyObject {
    fun method() {
        println("method")
    }
}


fun main(args: Array<String>) {
    MyObject.method()

    println("=======================")
    //MyTest.Companion.method()
    MyTest.MyObject.method()
    println("======================")
    MyTest.method()
    println(MyTest.a)

    val v = MyTest.MyObject // 这个是定义在MyTest中的内部类，在编译的时候，会转变成一个MyTest的内部类来解决
    //

    println(v)

    println("*****************************************")
    D.foo()
    D.bar()

    D.Companion.foo()
    D.Companion.bar()

}

// companion object ,伴生对象，静态方法不属于一个实例，是属于类的
// 但是Kotlin中，与Java不同的是，为是没有static方法的,无论Java还是Kotlion ，都会编译成字节码
// 在大多数情况下，Kotlin推荐的做法是使用包级别的函数来作为静态方法
// Kotlin会将包级别的函数当做静态方法来看待
// Java静态方法和静态属性是通过method来处理的,
// 如果从语法上来讲，伴生对象就是用来做静态方法和静态属性的功能的,在很多的情况下，
// 注意：虽然伴生对象的成员看起来像是Java中的静态成员，但是在运行期，他们依旧是真实对象的实例成员
// 在JVM上，可以将伴生对象的成员真正的生成类的静态方法与属性，这是通过@JVMStatic注解实现的
// 伴生对象在编译生，会生成一个静态的内部类
//

class MyTest {
    companion object MyObject {
        //如果不提供伴生对象的名字，那么编译器会提供一个默认的名字Companion
        var a: Int = 100

        @JvmStatic // method这个会变成一个静态的方法
        fun method() {
            println("method invoked ")
        }
    }

}

class D {
    companion object {
        @JvmStatic //  public static final com.shengsiyuan.kotlin.demo.D$Companion Companion;
        fun foo() {
            println("foo")
        }

        fun bar() {
            println("bar")
        }
    }
}