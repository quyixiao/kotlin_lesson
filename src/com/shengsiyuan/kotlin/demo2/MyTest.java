package com.shengsiyuan.kotlin.demo2;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    public static void main(String[] args) {
       /* List<String> list = new ArrayList<>();
        List<Object> list2 = list;//List<String> 并不是List<Object>的子类型
        list2.add(3);
        list2.add(new Integer(2));
        String str = list2.get(0);//显然，在没有做任何强制类型的情况下，将Object类型转换成String类型
        */

       /* List<Cat> cats = new ArrayList<>();
        List<? extends Animal> animals = cats;*/

        //animals.add(new Cat()); 协变是一个类型的子类型
        //animals.add(new Dog()); 逆变是将一个类型转换成他的父类型


        List<Animal> animals = new ArrayList<>();
        List<? super Animal> contravariantAnimals = animals;

        List<Object> list = new ArrayList<>();
        contravariantAnimals = list;

        contravariantAnimals.add(new Cat());
        contravariantAnimals.add(new Dog());
        //contravariantAnimals.add(new Object()); //这个是不允许的，父类型

        //Animal animal = contravariantAnimals.get(0);
        Object[] objs = new String[]{"hello", "world"};
        objs [0] = new Object();






    }


}


class Animal {

}

class Cat extends Animal {

}

class Dog extends Animal {

}