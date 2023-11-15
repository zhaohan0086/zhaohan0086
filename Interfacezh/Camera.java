package com.zhaohan.Interfacezh;

public class Camera implements USB{//同样实现接口
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
