package com.zhaohan.Trycatch;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.Comparator;

//Book クラスを定義し、その中には name と price のプロパティが含まれています。
// また、price でソートする要求があります（大きい順に）。
// 2つの異なる方法でソートする必要があり、Book[] books には4冊の本のオブジェクトが含まれています。
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅新",90);
        books[2] = new Book("青年文摘20年",5);
        books[3] = new Book("java从入门到放弃",300);

        //priceを大きい順に並べ替え
//        Arrays.sort(books, new Comparator() {
//            //
//            @Override
//            public int compare(Object o1,Object o2) {
//                Book book1 = (Book)o1;
//                Book book2 = (Book)o2;
//                double priceVal =  book2.getPrice() - book1.getPrice();
//                if (priceVal > 0) {
//                    return  1;
//                } else if (priceVal < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        }
//
//        );

        //priceを小さい順に並べ替え
//        Arrays.sort(books, new Comparator() {
//                    //
//                    @Override
//                    public int compare(Object o1,Object o2) {
//                        Book book1 = (Book)o1;
//                        Book book2 = (Book)o2;
//                        double priceVal =  book2.getPrice() - book1.getPrice();
//                        if (priceVal > 0) {
//                            return  -1;
//                        } else if (priceVal < 0){
//                            return 1;
//                        }else {
//                            return 0;
//                        }
//                    }
//                }
//
//        );
        //書名の長さ順に並べ替える
        Arrays.sort(books, new Comparator() {
                    //
                    @Override
                    public int compare(Object o1,Object o2) {
                        Book book1 = (Book)o1;
                        Book book2 = (Book)o2;
                       return book2.getName().length() - book1.getName().length() ;

                    }
                }

        );
        System.out.println(Arrays.toString(books));
    }
    static class Book{
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Book(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
