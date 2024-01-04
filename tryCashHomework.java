package com.zhaohan.Trycatch;
//输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则就生成异常对象
//要求
//(1)用户名长度为2或3或4
//(2)密码的长度为6，要求全是数字
//(3)邮箱中包含@和.  并且@在.的前面

//思路分析
//（1）先编写方法 userRegister（String name，String pwd，String email）{}
//（2）针对输入的内容进行校验，如果发现有问题，就抛出异常，给出提示
//单独写一个方法，判断字符串是否是数字

public class tryCashHomework {

    public static void main(String[] args) {
        String name = "jacky";
        String pwd = "123456";
        String email = "jacky@sohu.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void userRegister(String name,String pwd,String email){
        //过关斩将
        //第一关
        int userLength = name.length();
        if ((userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度为2或者3或者4");
        }
        //第二关
        if (!(pwd.length() == 6 && isDigital(pwd)) ){
            throw new RuntimeException("密码要求长度为6，并且全是数字");
        }
        //第三关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i >= 0 && j >i)) {
            throw new RuntimeException("邮箱中包含@和.  并且@在.的前面");
        }
    }
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
