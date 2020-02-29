package com.shengsiyuan.kotlin.demo2

// star projection 星投影
// Star<out T> 如果T的上界是TUpper,那么Start<*>就相当于Start<out T> 。
// 这个表示当T的类型未知时，你就可以从Start<*>当中安全地读取TUpper类型的值
// Start<in T> :Start 就相当于Star<in Nothing> ，这表示你无法向其中写入任何值
// Start<T> 如果T 的上界为TUpper，那么Start<*> 就相当于读取时的Start<out Tupper>以及
// 写入时的Start<in Nothing>

class Star<out T> {

}


class Star2<in T> {
    fun setValue(t: T) {

    }

}


class Star3<T>(private var t:T) {
    fun setValue(t: T) {

    }
    fun getValue():T{
        return this.t
    }
}




fun main(args: Array<String>) {
    val star: Star<Number> = Star<Int>()
    val star2: Star<*> = star

    val star3: Star2<Int> = Star2<Number>()
    val star4: Star2<*> = star3


    val star5 :Star3<String> =Star3<String>("hello")
    val start6:Star3<*> = star5
    start6.getValue()



}
