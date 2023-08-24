package com.zhaohan.homework;

public class Homework08 {
    public static void main(String[] args) {
        //CheckingAccount checkingAccount = new CheckingAccount(1000);
        //checkingAccount.deposit(10);//1010 - 1 = 1009
        //checkingAccount.withdraw(9);//1009 - 9 = 1000 - 1 =999
        //System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);//这个月第一次存钱
        savingsAccount.deposit(100);//这个月第二次存钱
        savingsAccount.deposit(100);//这个月第三次存钱
        System.out.println(savingsAccount.getBalance());//1300

        savingsAccount.deposit(100);//这个月第四次存钱，从第四次开始就要收取收钱的手续费了
        System.out.println(savingsAccount.getBalance());//1400-1=1399

        //月初，定时器会自动调用一下 earnMonthlyInterest
        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());//1399+13.99=1412.99
        //当我们再次进行取款的时候，就又不会收费了，因为20行的earn方法，把免手续费3（count）给重置了
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());//1312.99


    }
}
