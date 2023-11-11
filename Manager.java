package com.zhaohan.abstractw;

public class Manager extends Employee{
    public double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int ID, double salary) {
        super(name, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("经理 " + getName() + "工作中...");
    }
}
