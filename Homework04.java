package com.zhaohan.homework;

public class Homework04 {
    public static void main(String[] args) {
        manager manage = new manager("zhaoHan", 100,
                20, 1.2);
        manage.setBonus(3000);
        manage.printSal();
    }
}
