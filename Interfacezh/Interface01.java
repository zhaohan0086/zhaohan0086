package com.zhaohan.Interfacezh;

public class Interface01 {
    public static void main(String[] args) {
        //创建手机，相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入计算机

        System.out.println("============");

        computer.work(camera);

    }
}
