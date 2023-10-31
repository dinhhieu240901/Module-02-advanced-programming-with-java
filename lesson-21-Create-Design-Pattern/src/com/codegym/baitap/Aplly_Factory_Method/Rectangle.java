package com.codegym.baitap.Aplly_Factory_Method;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Vẽ hình chữ nhật");
    }

    public void finish(){
        System.out.println("Đã vẽ xong hình chữ nhật");
    }
}
