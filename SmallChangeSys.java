package com.zhaohan.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//零钱通开始
public class SmallChangeSys {
    //化繁为简
    //1.先完成显示菜单，并可以选择菜单，给出对应提示
    public static void main(String[] args) {
        //定义相关变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

    /*2.完成零钱通明细  *可以把收益入账和消费，保存到数组
                     *可以使用对象
                     *简单的话也可以使用String拼接
     */
        String details = "----------------零钱通明细------------------";

    //3.完成收益入账 完成功能驱动程序员增加新的变化和代码
        double money = 0;
        double balance = 0;
        Date date = null;//date 是java.util.Date  类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
    //4.消费
    //定义新变量，保存消费的原因
    //退出
    //用户输入4退出时，给出提示“你确定要推出吗？” y/n,必须输入正确的y/n，否则循环输入指令，直到输入y或者n
        String note = "";
        do {
            System.out.println("=============零钱通菜单==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();
            //使用switch分支控制

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2 收益入账");
                    money = scanner.nextDouble();
                    //money的值应该校验，一会再完善

                    balance += money;
                    //拼接收益入账信息到 details
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    //money的值范围应该校验，一会再完善
                    System.out.println("消费说明");
                    note = scanner.next();
                    balance -= money;
                    //拼接消费信息到details
                    date = new Date();//获取当前日期
                    details += "\n" + note + "\t-" + money +"\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    //用户输入4退出时，给出提示“你确定要推出吗？” y/n,必须输入正确的y/n，
                    // 否则循环输入指令，直到输入y或者n
                    //韩顺平老师的思路分析
                    //(1)定义一个变量 choice 选择 ，接受用户的输入
                    //(2)使用while + break 来处理接受到的输入时 y/n
                    //(3)退出while后，再判断choice是 y/n

                    String choice = "";
                    while (true) {//要求用户必须输入y/n，否则就一直循环
                        System.out.println("你确定要退出吗 y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    //当用户退出while ，进行判断
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    System.out.println("4 退出");
                    loop = false;
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        }while (loop);
        System.out.println("退出了零钱通项目");
    }
}
