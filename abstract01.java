package com.zhaohan.abstractw;

public class abstract01 {
    public static void main(String[] args) {
        Manager jacky = new Manager("jacky",999,50000);
        jacky.setBonus(8000);
        jacky.work();

        CommonEmployee tom = new CommonEmployee("tom", 888, 20000);
        tom.work();

    }
}
