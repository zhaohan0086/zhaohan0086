package com.zhaohan.Trycatch;
/*
编写方法要求完成输出格式要求的字符串
编写java程序，输入形式为：Han shun ping 的人名，以Ping ，Han.S   的形式打印
其中.S  是中间单词的首字母
思路分析
（1）对输入的字符串进行分割split("")
（2）对得到的String[]进行格式化String.format()

 */
public class tryCashPrintName {
    public static void main(String[] args) {
        String name = "Han shun ping";
        printName(name);
    }
    public static void printName(String str) {
        if (str == null) {
            System.out.println("str 不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串不对");
            return;
        }
        String format = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
