package com.zhaohan.homework;

public class C extends B{
    public C() {
        this("hello");
        System.out.println("我是C类的无参构造器");
    }
    public C(String name) {
        System.out.println("我是C类的有参构造器");
    }
}
