package com.zhaohan.houserent.view;


import com.zhaohan.houserent.domain.House;
import com.zhaohan.houserent.service.HouseService;
import com.zhaohan.houserent.utils.Utility;

import javax.sound.midi.Soundbank;

/**
 * 显示界面
 * 接受用户的输入
 * 调用HouseService完成对房屋信息的各种操作
 */
public class Houseview {
    //显示主菜单
    private boolean loop = true;
    private char key =' ';//里面必须有空格，否则报错
    private HouseService houseService = new HouseService(10);//设置数组的大小为10,当房屋数量大于10的时候，就会报错

    //根据ID修改房屋信息
    public void upDate() {
        System.out.println("======修改房屋信息======");
        System.out.println("请选择待修改编号(-1表示推出)");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("======你放弃修改房System.out.println(\"姓名(\" + house.getName);屋信息======");
            return ;
        }
        //根据输入得到updateId,查找对象

        //老师特别提示：返回的是引用类型{即；就是数组里面的元素}
        //因此老师在后面对house.setXxx(),就会直接修改HouseService中数组的元素！！！！！！
        House house = houseService.findById(updateId);//老师返回的是引用类型[]
        if (house == null) {
            System.out.println("======想要修改的房屋信息编号不存在");
            return;
        }
        System.out.println("姓名(" + house.getName() +"):");
        String name = Utility.readString(8,"");//如果这里回车则表示不修改该信息，默认“”
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12);
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(18,"");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(3,"");
        if (!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("修改房屋信息成功");







    }
    //根据id查找房屋信息
    public void findHouse() {
        System.out.println("======查找房+屋信息======");
        System.out.println("======请输入你要查找的id======");
        int findId =Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        }else {
            System.out.println("当前房屋不存在");
        }

    }
    //退出功能的实现
    public void exit() {
        //这里使用Utility提供方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
    //编写delHouse() 接受输入的id，调用Service 的del方法
    public void delHouse () {
        System.out.println("======删除房屋信息======");
        System.out.println("请输入待删除的房屋编号（-1退出）");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("======放弃删除房屋信息======");
            return ;
        }
        System.out.println("请再次确认你想删除（y/n）这个房屋");
        char choice = Utility.readConfirmSelection();//注意该方法本身就有循环判断的逻辑，所以必须输出y/n
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("======删除房屋信息成功======");
            } else {
                System.out.println("======房屋编号不存在，请重试");
            }
        }else {
            System.out.println("======放弃删除房屋信息======");
        }

    }


    //编写addHouse() 接受输入，创建House对象，调用add方法

    public void addHouse() {
        System.out.println("==========添加房屋==========");
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租:");
        int rent = Utility.readInt();
        System.out.println("状态:");
        String state = Utility.readString(3);
        //创建一个House对象,注意ID 是系统分配的
        House newHouse = new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)) {
            System.out.println("======添加房屋成功======");
        }else {
            System.out.println("======添加房屋失败======");
        }
    }

    //编写listHouse()显示房屋列表
    public void listHouses() {
        System.out.println("==========房屋出租系统菜单========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0 ; i <houses.length ; i++) { //这里可能是有错误出现的，和null相关哦，所以下一行应该添加null判断语句
            if (houses[i] == null) {//null判断语句，如果数组houses[i]为null，则不用显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("房屋列表显示完毕");
    }
    public void mainMenu () {
    do {
        System.out.println("==========房屋出租系统菜单========");
        System.out.println("\t\t\t1新 增 房 源");
        System.out.println("\t\t\t2查 找 房 屋");
        System.out.println("\t\t\t3删 除 房 屋 信 息");
        System.out.println("\t\t\t4修 改 房 屋 信 息");
        System.out.println("\t\t\t5房 屋 列 表");
        System.out.println("\t\t\t6退       出");
        System.out.println("请输入你们的选择（1-6）");
        key = Utility.readChar();
        switch (key) {
            case '1':
                addHouse();
                break;
            case '2':
                findHouse();
                break;
            case '3':
                delHouse();
                break;
            case '4':
                upDate();
                break;
            case '5':
                listHouses();
                break;
            case '6':
                exit();
                break;
        }

    }while (loop);
    }
}
