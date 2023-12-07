package com.zhaohan.enumHomework;
/*
有一个交通工具接口类Vehicles，有work接口有Horse类和Boat类分别实现Vehicles创建交通工具工厂类，
有两个方法分别获得交通工具Horse和Boat有Person类，有name和Vehicles属性，
在构造器中为两个属性赋值实例化Person对象“唐僧”，
要求一般情况下用Horse作为交通工具遇到大河时用Boat作为交通工具使用代码实现上面的要求
*/
public class Homework06 {
    public static void main(String[] args) {
        Person tang1 = new Person("tang", new Horse());
        tang1.common();
        tang1.passRiver();
    }
}
