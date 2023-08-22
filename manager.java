package com.zhaohan.homework;

public class manager  extends Employee{
    //特有属性 bonus
    private double bonus;
    //创建manager的时候奖金多少是不确定的，所以用get和set方法来实现

    public manager(String name, double daySal, int workDays,
                   double grade) {
        super(name, daySal, workDays, grade);
    }
    //因为这里有新的属性,而且计算方式与普通员工有所不同，所以要重写父类的方法


    @Override
    public void printSal() {
        System.out.println("经理是" + getName() +
                " 工资是" + (bonus + getDaySal()*getWorkDays()*getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
