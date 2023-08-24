package com.zhaohan.homework;

public class Homework10 {
        //测试
        public static void main(String[] args) {
            Doctor doctor1 = new Doctor("kack", 20, "it工程师", '男', 20000);
            Doctor doctor2 = new Doctor("kack", 20, "it工程师", '男', 20000);
            System.out.println(doctor1.equals(doctor2));
        }
}
