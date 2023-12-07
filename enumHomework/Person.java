package com.zhaohan.enumHomework;

public class Person {
    private String name;
    private Vehicles vehicles;
    //在创建人对象的时候，先要有个交通工具
    //那么要思考一个问题，如何不浪费，zai'gou'jian'dui'xiang'shi
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //一般情况下用Horse作为交通工具遇到大河时用Boat作为交通工具使用代码实现要求
    //这里涉及编程思想，就是把具体的要求封装成方法
    public void passRiver(){
        //得到船
        //Boat boat = VehiclesFactory.getBoat();
        //boat.work();

        //这里要判断一下，当前的vehicles 属性是null，就获取一艘船
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //得到马儿
        //Horse horse = VehiclesFactory.getHorse();
        //horse.work();

        //这里要判断一下，当前的vehicles 属性是null，就获取一匹马
        if (!(vehicles instanceof Horse)) {//如何防止始终使用的是传入的马
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
}
