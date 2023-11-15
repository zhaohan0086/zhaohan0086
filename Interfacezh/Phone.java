package com.zhaohan.Interfacezh;
//Phone 类 实现了USB
//解读1.即Phone类需要实现USB接口 规定/声明的方法
public class Phone implements USB{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
