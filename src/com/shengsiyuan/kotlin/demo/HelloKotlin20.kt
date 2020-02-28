package com.shengsiyuan.kotlin.demo

/***
 * var propertyName :propertyType = initValue
 *  get(){
 *      return field
 *  }
 *  set(value){
 *      field = value
 *  }
 *  只读属性是有两个特点，
 *      1.用val修饰
 *      2.只有get方法，没有set方法
 *  backing field : 支撑字段，
 */
class ThePerson(address: String, name: String) {
    val age: Int
        get() = 20
    var address: String = address //如果没有定义，会默认的生成的 ,这个是初始化值，如果直接调用
        get() {
            println(" address get invoked")
            return field // 背后的指代的值
        }
        set(value) {
            println("set invoked ")
            field = value
        }
    //其实也是在学python的魔术方法
    var name: String = name
        get() { //提示冗余的实现
            return field
        }
        set(value) {
            field = value
        }

    // lombok 用相应的注解来实现
    // @Getter
    // @Setter
    // @Data
    // class ... 本身就是一个Java包
    //
    //
}

fun main(args: Array<String>) {
    var person = ThePerson("shanghai", "zhangsan")
    println(person.age) //内部是会调用他的get方法g
    println(person.address)
    person.address = "hangzhou"
    println(person.address)


    println("***********************如果没有声明，他的get set 方法将会被隐式的声明出来*****************************")
    println(person.name)
    person.name = "lisi"
    println(person.name)


}





