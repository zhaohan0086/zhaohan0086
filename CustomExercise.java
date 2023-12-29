package com.zhaohan.Trycatch;


public class CustomExercise {
    public static void main(String[] args) {
//        int age = 119;
//        //要求年龄必须在18-120之间，否则抛出一个异常
//        if (!(age>=18 && age<=120)) {
//            throw new AgeExcepiton("年龄有误，年龄必须在18-120之间");
//        }
//        System.out.println("年龄范围正确");

        int i = 0;
        i = fun();
        System.out.println(i);

    }

    static int fun() {
        int i = 3;
        int n = 1;

        try {
            n = i/0;
        }
        catch (ArithmeticException e){

            int i1 = 1;
            int i2 = 1;
            int i3 = 1;
            int i4 = 1;
            int i5 = 1;

        }
        finally {

            System.out.println("345");
            return 2;
        }
    }
}



//自定义一个异常
class AgeExcepiton extends RuntimeException {
    public AgeExcepiton(String message) {//构造器
        super(message);
    }
}


