package com.shengsiyuan.kotlin.demo11;

public class HelloJava2 {


    public static void main(String[] args) {
        // 我们是无法通过 new 关键字来创建 Kotlin 编辑器自动生成以 Kt结尾的类的实例
        // HelloKotlin2Kt helloKotlin2Kt = new HelloKotlin2Kt();
        // 因为在生成的字节码中没有不带参数的构造方法
        //

        MyClass myClass = new MyClass();
        HelloKotlin2Kt.setStr("welcome");
        System.out.println(HelloKotlin2Kt.getStr());
        HelloKotlin2Kt.test();

    }
}
