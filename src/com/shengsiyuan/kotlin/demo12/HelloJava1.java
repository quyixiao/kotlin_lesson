package com.shengsiyuan.kotlin.demo12;

import java.util.ArrayList;
import java.util.List;

public class HelloJava1 {


    public static void main(String[] args) {
        List<String> list = HelloKotlin1Kt.myFilter(new ArrayList<>());
        List<Integer> list2 = HelloKotlin1Kt.myFilter2(new ArrayList<>());
        System.out.println(list);
        System.out.println(list2);


    }
}
