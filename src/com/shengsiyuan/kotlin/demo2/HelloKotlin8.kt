package com.shengsiyuan.kotlin.demo2

class MyStorage<out T> (private var t:T){
    fun getValue():T{
        return this.t
    }
    // Suppresses errors about variance conflict
    // 压制不安全变量的冲突
    fun setValue(t:@UnsafeVariance T){
        this.t = t
    }

}

fun main(args: Array<String>) {
    var myStoreage1  :MyStorage<Int> = MyStorage(5)
    var myStorage2 :MyStorage<Any> = myStoreage1

    println(myStorage2.getValue())
    myStorage2.setValue("hello")// 泛型擦除，我们在一个类中，声明一个泛型类型，真实的落到字节码上，
    println(myStorage2.getValue())
}