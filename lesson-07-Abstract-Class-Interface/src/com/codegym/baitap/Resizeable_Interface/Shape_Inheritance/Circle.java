package com.codegym.baitap.Resizeable_Interface.Shape_Inheritance;

import com.codegym.baitap.Resizeable_Interface.Colorable;
import com.codegym.baitap.Resizeable_Interface.Drawable;
import com.codegym.baitap.Resizeable_Interface.Resizeable;

public class Circle extends Shape implements Resizeable, Drawable, Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent){
        radius *= percent / 100.0;
    }


    @Override
    public void draw() {
        System.out.println("Vẽ một hình tròn có bán kính " + radius);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all around.");
    }
}