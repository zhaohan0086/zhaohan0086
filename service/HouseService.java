package com.zhaohan.houserent.service;

import com.zhaohan.houserent.domain.House;
import com.zhaohan.houserent.utils.Utility;

public class HouseService {
    private  House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录现在id增长到多少了
    //构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，老韩这里初始化一个House对象
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
   }

   //find方法，返回house对象或者null
    public House findById (int findId) {
        for (int i = 0;i < houseNums;i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
   //del方法先删除一个房屋信息
   public boolean del(int delId) {
        //首先找到要删除房子的信息对应的下标
        //老韩强调，一定要搞清楚下标和房屋编号不是一回事，
        int index = -1;
        for (int i = 0;i < houseNums; i++) {
            if (delId == houses[i].getId()) {//要删除的房屋（id），是数组下标为i的元素
                index = i;//就使用index记录i
            }
        }
        if (index == -1) {//说明gelId在数组中不存在（有点绕）
            return false;
        }
        //如果说找到了，就要进行整个程序里面比较难得一项了
       for (int i = index;i<houseNums - 1;i++) {
           houses[i] = houses[i+1];
       }
       houses[--houseNums] = null;//为什么是后--，因为要把数组最后一个变成null
       return true;


   }
   //add方法 ，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否可以继续添加（暂时不考虑扩容的情况）
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
    //把newHouse对象加入到houses数组里面，并且在里面自增（后++），就表示新增了一个房屋
    houses[houseNums++] = newHouse;
    //我们需要一个ID自增长的机制,注意这里是前++，就是先自增1，然后在set给newHouse新ID
    newHouse.setId(++idCounter);
    return true;
    }

   //list方法，返回houses
    public House[] list() {
        return houses;
    }

}
