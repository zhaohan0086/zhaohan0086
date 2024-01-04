package com.zhaohan.Trycatch;

public class reverseHomework01 {
    public static void main(String[] args) {
        //テスト
        String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);
        try {
            str = reverse(str,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(str);
    }
public static String reverse(String str,int start,int end) {

// 入力パラメータの検証
// 老韩の重要なプログラミングテクニックの共有！！！
// （1）正しい状況を書く
// （2）それを否定すれば良い
        if (!(str != null && start >= 0 && end > start && end < str.length()) ){
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';// 交換のための補助変数
    for (int i = start,j = end;i < j;i++,j--) {
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    //// charsを使用して新しいStringを構築し、返す
    return new String(chars);
}
}
