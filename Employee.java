package com.zhaohan.abstractw;

abstract public class Employee {
    private String name;
    private int ID;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;

    }
    //将work做成一个抽象方法
    public abstract void work();
}
