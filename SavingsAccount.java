package com.zhaohan.homework;

/**
 * 扩展前一个练习的BankAccount类，
 * 新类SavingsAccount每个月都有利息产生（earnMonthlyInterest方法被调用）
 * 并且有每月三次免手续费的存款或者取款，在earnMonthlyInterest方法中重置交易计数
 */
public class SavingsAccount extends BankAccount{
    //老韩分析
    //新增加属性
    private int count = 3;
    private double rate = 0.01; //利率

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
        this.count = count;
        this.rate = rate;
    }

    public void earnMonthlyInterest() {//每个月初，我们统计上个月的利息，同时将count=3还原
        count = 3;
        super.deposit(getBalance() * rate);

    }
    @Override
    public void deposit(double amount) {//存款
        //判断是否还可以免手续费
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);//一块钱转入银行
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {//取款
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);//一块钱转入银行
        }
        count--;
    }
}

