package com.zhaohan.debug;

public class Debug02 {
    public static void main(String[] args) {
        int[] arr = {1,10,-1};
        A aa = new A();
        aa.fun();
        for (int i = 0;i <= args.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("退出for循环");
    }
}
class A {
    public A() {
    }

    public   void  fun(){
        System.out.println("111");
    }
}