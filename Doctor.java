package com.zhaohan.homework;

public class Doctor {
    //属性
    //{name,age,job,gender,sal}
    private String name;
    private int age;
    private String job;
    private char gender;//性别
    private double sal;

    //5个参数的构造器

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    //方法
    public boolean equals(Object obj) {
        //判断两个比较对象是否相同
        if(this == obj) {
            return true;
        }
        //判断两个比较对象是否相同
        if(!(obj instanceof Doctor)) {//当用instanceof比较的时候if (对象 instanceof 类名)
            return false;             //如果对象是指定类或其子类的实例，执行此处的代码
        }
        //向下转型，因为obj的运行类型是Doctor或者他的子类类型
        Doctor doctor = (Doctor) obj;
        return this.name.equals(doctor.name) && this.age  == doctor.age &&
                this.gender == doctor.gender && this.sal == doctor.sal;
    }



}
