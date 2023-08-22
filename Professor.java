package com.zhaohan.homework;

//子类的特有属性可以自己增加
public class Professor extends Teacher {
    public Professor(String name, int age, String post,
                     double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
