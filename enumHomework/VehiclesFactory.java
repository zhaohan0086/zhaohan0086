package com.zhaohan.enumHomework;

public class VehiclesFactory {
    //马儿始终是同一匹马
    public static Horse horse = new Horse();//饿汉式
    //创建交通工具工厂类，有两个方法分别获得马和船这两种工具
    //这里，我们将方法做成static
    public static Horse getHorse(){
        //return new Horse();
        return  horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
