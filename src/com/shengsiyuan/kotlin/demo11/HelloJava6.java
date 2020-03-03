package com.shengsiyuan.kotlin.demo11;

public class HelloJava6 {


    public static void main(String[] args) {
        //JvmField 加入属性以后，就不会为这个属性添加 get set 方法 Cannot resolve method 'getAge' in 'Companion'
        // JvmField修饰一个伴生对象的时候，将属性转化成 public ,同时，这个属性属于这个对象
        System.out.println(People.age);
        System.out.println(People.Companion.getName());
    }
}
