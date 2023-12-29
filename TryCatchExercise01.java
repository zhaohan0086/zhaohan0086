package com.zhaohan.Trycatch;

import java.util.Scanner;

public class TryCatchExercise01 {
    public static void main(String[] args) {
        //如果用户输入的不是一个整数，就提示他反复输入，知道输入一个整数为止
        //思路
        //1.创建Scanner对象
        //2.使用无线循环，去接受一个输入
        //3.然后将该输入的值转成一个int
        //4.如果在转换时，抛出异常，说明输入的内容不是一个可以转成int的内容
        //5.如果没有抛出异常，则break 该循环

        Scanner scanner = new Scanner(System.in);
        int numb = 0;
        String input = "";
        while (true) {
            System.out.println("请输入一个整数:");//
            input = scanner.next();
            try {
                numb = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是整数");
            }

        }
        System.out.println("您输入的数是" + numb);
    }
}


