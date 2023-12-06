package com.zhaohan.enum_;

//1.计算器接口具有work方法，功能是运算，有一个手机类cellphone，定义方法testWork测试计算功能，调用计算接口的work方法
//2.要求调用cellphone对象 的testwork方法，使用上 匿名内部类
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //老汉解读
        //
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,8);
    }
}
//编写接口
interface ICalculate {
    //work方法 是完成计算，但是题目没有要求，所以自己设计
    //至于该方法完成怎样的计算，我们交给匿名内部类来完成
    public double work (double n1,double n2);

}
class Cellphone {
    //老韩解读，当我们调用testWork方法时，直接传入一个实现了ICalculate接口的匿名内部类即可
    public void testWork(ICalculate iCalculate,double n1,double n2) {
        double result = iCalculate.work(n1, n2);
        System.out.println("计算后的结果是=" + result);
    }
}