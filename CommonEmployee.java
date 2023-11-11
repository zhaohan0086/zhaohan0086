package com.zhaohan.abstractw;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + getName() + "工作中...");
    }
}
