package com.zhaohan.homework;

public class Label extends Point{
    //特有属性
    private String label;

    public Label(double x, double y, String label) {
        super(x, y);
        this.label = label;

    }


    @Override
    public String toString() {
        return super.toString() + " label=" + label;
    }
}
