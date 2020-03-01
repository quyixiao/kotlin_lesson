package com.shengsiyuan.kotlin.demo4

// 委托（delegation）
// 类委托
interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(val str: String) : MyInterface {
    override fun myPrint() {
        println("welcome " + str)
    }
}

/***
 * 委托原理
 * by 关键字后面的对象实际上会被存储在类的内部，编译器则会父接口中所有的方法实现出来，并且将
 * 实现转移给委托对象来去进行
 */
class MyClass(myInterface: MyInterface) : MyInterface by myInterface {
    private var myInterface:MyInterface = myInterface
    override fun myPrint() { //如果自己有了，那么用自己的，优先用自己的
        println("hello world")
        myInterface.myPrint()
    }
}

fun main(args: Array<String>) {
    val myInterfaceImpl = MyInterfaceImpl("zhangsan")

    var myClass = MyClass(myInterfaceImpl)
    myClass.myPrint()

}






