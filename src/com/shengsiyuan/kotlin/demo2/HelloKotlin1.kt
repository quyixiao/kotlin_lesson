package com.shengsiyuan.kotlin.demo2

//数据类-data-class
// lombok
//
/***
 * 数据类需要满足的要求
 * 1.主构造方法至少需要一个参数
 * 2. 所有的主构造方法参数都需要被标记var或者val
 * 3. 数据不能是抽象的，open 的，sealed的以及inner的
 * 对于数据类，编译器会自动生成如下内容
 *
 * 1.equals/hashCode对
 * 2.toString()方法,形式为Person(name=....,age=....,adress=...)
 * 3.针对属性的componentN方法，并且是按照属性的声明顺序来生成的
 *
 *  关于数据类成员的继承的要点
 *  1.如果数据类中显示定义了equals，hashCode或者是toString方法，或者是在数据类的父类中将这些方法声明成final,
 *      那么，这些方法就不会再生成，转而使用已有的
 *  2.如果父类拥有了componentN方法，并且这是open的以及返回的兼容的类型，那么，编译器就会在数据类中生成相应的componentN方法，
 *      并且重写父类的这些方法，如果父类的这些方法由于不兼容的签名或者被定义为final的，那么编译器就会报错
 *  3. 在数据类中显式的提供componetN方法以及copy方法实现是不允许的。
 *
 *  解构声明
 *      在主构造方法中有多少个参数，就会依次生成对应的componnent1,component2,component3
 *      这些方法返回的就是对应字段的值，componentN方法就是用来实现解构声明的
 *
 */

data class Person(val name: String, var age: Int, var address: String) {
    // 说明这个类中已经定义了这个方法了
    // Conflicting overloads: public final fun copy(name: String, age: Int, address: String): Unit defined in com.shengsiyuan.kotlin.demo2.Person
    //    fun copy(name:String,age:Int,address: String){
    //}
}


/***
 * 在Jvm 中，如果生成的类需要拥有无参的构造方法，那么就需要为所有的属性指定默认值
 *
 */
data class Person2(val name: String = "", var age: Int = 30, var address: String = "") {

}

fun main(args: Array<String>) {
    var person = Person("zhangsan", 20, "beijing")
    //person.name = "xxxxxxx" Val cannot be reassigned
    person.age = 40
    println(person)

    //不要将kotlin和底层的class对象混淆
    person.age = 50
    println(person.age)

    // copy 方法，表示你想修改已有对象的哪一个属性
    var person2 = person.copy(address = "hangzhou", age = 2)//如果一定要提供名字，如果不提供名字，可能不是我们想要的
    println(person2)

    println("******************************************************")

    var (name, age, address) = person //将整体的分解成一个个变量
    println(name)
    println(address)

    //如果需要生成一个无参的构造方法，那么要为所有值赋初始值，那么就会生成一个无参的构造方法，
    var p2 = Person2()
    println(p2)



}