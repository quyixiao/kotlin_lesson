package com.shengsiyuan.kotlin.demo5


// 默认参数（default arguments）
fun test(a: Int = 0, b: Int = 0) = println(a - b)

/***
 *  对于重写的方法来说，子类拥有重写方法会使用与父类相同的默认参数值
 *  在重写一个拥有默认参数值的方法时，方法的签名必需要将默认的参数值省略掉
 *  如果一个默认参数位于其他无默认值参数前面，那么默认值只能通过调用函数时使用具名参数的方式来使用
 */
open class A {
    open fun method(a: Int, b: Int = 4) = a + b
}

class B : A() {
    override fun method(a: Int, b: Int): Int = a + b
}

// 如果一个默认参数位于其他默认参数前面，那么默认值只能通过在调用函数时使用具名参数的方式来使用
fun test2(a: Int = 1, b: Int) = println(a - b)

fun test3(a: Int = 1, b: Int = 2, compute: (x: Int, y: Int) -> Unit) {
    compute(a, b)
}

// 具名参数，参数的名字
/***
 * 具名参数
 *
 * 在调用函数时，函数的参数可以具名的
 *
 * 当一个函数参数有大量的参数或者一些参数拥有默认值时，这种调用方式是比较方便的
 *
 *
 */
fun test4(a: Int, b: Int = 2, c: Int = 3, d: Int) = println(a + b + c + d)

/***
 * 在调用函数时，如果同时使用了位置参数或者具名参数，那么所有的位置参数必需位于第一个具名参数之前
 *
 * 比如 ：foo(1,x=2)是允许的：不过 foo(x=1,2)是不允许
 */


/***
 * 可变参数
 */
fun test4(vararg strings: String) {
    println(strings.javaClass)//  string 的 java类型是数组类型
    strings.forEach { println(it) }
}

// 一定要显示的指定名字
/***
 *  如果函数的最后一个参数是 lambda表达式，而且在调用时是位于圆括号之外，
 *  那么就可以不为默认参数传值，可以不指定 lambda 表达式的具名参数名
 *
 */
fun main(args: Array<String>) {
    test()
    test(a = 1)
    test(b = 2)
    test(1, 2)
    test(1)
    println("**********************")
    var b = B()
    println(b.method(1))
    println("**********************")
    test2(2, 3)
    test3(3, 4, ::test2)

    test3(4, 1, { a, b -> println(a - b) })

    // 调用方法，函数的调用，后面整个内容都是作为函数的参数来调用的
    test3(2, 3) { a, b ->
        println(a - b)
    }
    test3(2) { a, b ->
        println(a - b)
    }
    test3() { a, b ->
        println(a - b)
    }

    println("*********************************")
    test4(1, 2, 3, 4)

    test4(a = 1, b = 2, c = 3, d = 4) //
    test4(a = 1, d = 5)


    test4("hello", "world", "hello world")

    test4("a", "b", "c")

    // 可变参数可以借助于 spread operator 以具名参数的形式传递
    test4(strings = * arrayOf("hello", "world", "hello world"))
    test4(strings = * arrayOf("a"))
    val arrays = arrayOf("a", "b", "c")
    test4(*arrays)
    /***
     * 在 kotlin 中调用 Java方法时不能使用具名参数语法，因为 java字节码并不总是会保留方法的参数名信息
     */

}