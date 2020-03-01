package com.shengsiyuan.kotlin.demo4

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty



/****
关于属性委托的要求
对于只读属性来说（val 修改的属性），委托属性提供了一个名为getValue的方法，该方法接收如下参数：
-thisRef，需要是属性名拥有者相同的类型或是其父类型，对于扩展的属性来说，这个类型指的是被扩展的那个类型
-property ，需要的是KProperty<*> 类型或者是其父类型


getValue方法需要返回与属性相同的类型或者是其子类型
对于可变属性来说（var 修改的属性），委托需要再提供一个名为setValue的方法，该方法需要接收如下参数
-thisRef ，与getValue方法thisRef 要求一致
-property,与getValue方法property要求是一致的
-new value ，需要与属性的类型相同或其父类型
getValue 与setValue 方法
即可以作为委托类的成员就方法实现，也可以作为其扩展方法来实现
这两个方法都必需要标记为operator关键字，对于委托类来说，它可以实现ReadOnlyProperty 或者是ReadWriteProperty接口，这些
接口包含了相应的getValue 与setValue方法，同时，对于委托类来说，也可以实现这两个接口，
委托转换规则：
对于每个委托属性来说，Kotlin编译器在底层会生成一个辅助的属性，然后将对原有的属性访问委托给这些辅助的属性，
比如说，对于属性prop来说，Kotlin编译器所生成的隐含的属性名为prop$delegate的属性,然后对原有的prop属性的访问器
的访问都只是委托给了这个额外的，Kotlin编译器所生成的辅助属性


提供委托（providing a delegate ）


通过定义 providedelegate operator,通过，我们可以扩展委托的创建逻辑的过程，如果对象定义了provideDelegate方法，那么该方法就会被
调用来创建属性的委托的实例

 **/


class PropertyDelegate : ReadOnlyProperty<People, String> {
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        return "hello world"
    }

}

class PeopleLauncher {
    operator fun provideDelegate(thisRef: People, property: KProperty<*>): ReadOnlyProperty<People, String> {
        println("welcome")
        when (property.name) {
            "name", "address1" -> return PropertyDelegate()
            else -> throw  Exception("not valid name")
        }
    }
}


class People {
    val name: String by PeopleLauncher()
    val address: String by PeopleLauncher()
}


fun main(args: Array<String>) {
    var person = People()
    //println(person.name)
    //println(person.address)
}