package com.zhaohan.homework;

public class Point {
    private double x;
    private double y;
    private String label;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y

                ;
    }
}
