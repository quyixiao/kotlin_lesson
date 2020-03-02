package com.shengsiyuan.kotlin.demo10


fun main(args: Array<String>) {
    var list = ArrayList<String>()
    list.add("hello")
    list.add("world")
    list.add("hello world")
    for (i in list) {
        println(i)
    }
    println("----------------------------")
    for (i in 0 until list.size) {
        println(list[i])
    }

    println("------------------------------")
    val person = Person()
    person.age = 20
    person.isMarried = false
    person.name = "zhangsan"
    println(person.age)
    println(person.isMarried)
    println(person.name)
    println("---------------------------------------")
    //  在 Java 中，所有的引用都可能为 null,然而是在 Kotlin 中，对 null 在有着严格的检查与限制的，这就使得某个来自于 Java引用在 Kotlin 中
    // 变得不再适合了，基于这个原因，在 Kotlin中，将来自于 Java 声明类型称为平台（Platform  Types）
    // 对于这个类型（平台类型）来说，在 Kotlin 的 null 检查就会得到一定的缓和，变得不再那么严格了，这样就使得空安全的就语义要求变得也 java 一致
    // 当我们调用平台类型引用方法时，Kotlin 就不会在编译期间施加空安全的检查，使得编译可以正常通过，但是运行期间则可能抛出异常，因为
    // 平台类型引用值有可能为null,


    val list2 = ArrayList<String>()
    list2.add("hello")
    var size =  list2.size
    println(size)
    var item = list2[0]
    println(item) // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
    println("----------------------------------------")
    val s:String ? = item // 允许，总是可以的
    val s2 :String = item // 允许，不过可能会在运行期失败,将一个平台的值传递给一个方法，那么

    // 如果我们选择非空类型的话，编译器在编译的时候会生成一个断言，
    // 防止值的传递的过程中出现空异常，这会防止 kotlin 的不可空变量持有 null 值，同样，这一点也适用于 Kotlin 方法参数传递
    // 我们在将一个平台类型值传递给方法的一个不可空参数时，也会生成一个断言
    // 总体来说，Kotlin 会竭尽所能防止null 赋值蔓延到程序其他的地方，而是在发生问题之处就立即通过断言来解决


}