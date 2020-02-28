package com.shengsiyuan.kotlin.demo2

// 泛型（generics） 变量类型参数化

// 关于协变与逆变的概念及来源
// List<Object> = new ArrayList()
// List<String> list2 = list ;//编译失败
// list2.add(new Date())
// list2.get(0) 这个是失败的
// String str = list.get(0) 这个是不允许的
// list<? extents Object > list ...
// interface Collection<E> {
//      void addAll(Collection<E> items);
// }
//  void copyAll(Collection<Object> to ,Collection<String> from){
//      to.addAll(from)//在java中这样写错误的，但是这个是一个非常觉的操作，所有的内容是没有任何的问题的
//  }
// interface Collection<E>{
//      void addAll(Collection<? extends E> items) 将他声明成具体的子类型来看待，而不是看成是子类型相关的内容
// }
//
// Collection<String> 就是Collection<? extends Object> 的子类型
// List<? super String>
// 我们如果只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者，如果只向里面写入数据，而不从中读取数据，那这样的数据，叫做消费者
// 生产者使用 ? extends E ;消费者使用? super E
//
class MyGeneric<T>(t: T) {
    var variable: T

    init {
        this.variable = t
    }
}

// out 表示只是用来读取的，不是用来修改的，所以读取的时候都是以Any 方式来读取的
class MyClass<out T, in M>(t: T, m: M) {
    private var t: T
    private var m: M

    init {
        this.t = t
        this.m = m
    }

    fun get(): T = this.t
    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>) {
    var myobject: MyClass<Any, Int> = myClass
    //var myobject: MyClass<String> = myClass
    println(myobject.get())
}


fun main(args: Array<String>) {
    var myGeneric = MyGeneric("hellow") //借助于kotlin类的推断
    println(myGeneric.variable)

    var myClass = MyClass<String,Number>("12383298",1)

    myTest(myClass)

}