package com.shengsiyuan.kotlin.demo10;

public class MyTest {

    public static void main(String[] args) {
        Object[] objects = new String[2];//Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
        objects[0] = 1;
        objects[1] = 2;

    }
}
