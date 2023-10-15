package com.codegym.baitap.Resizeable_Interface.Shape_Inheritance;

import com.codegym.baitap.Resizeable_Interface.Colorable;
import com.codegym.baitap.Resizeable_Interface.Drawable;
import com.codegym.baitap.Resizeable_Interface.Resizeable;

public class Rectangle extends Shape implements Resizeable, Drawable, Colorable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        width *=  percent / 100.0;
        length *=  percent / 100.0;
    }

    @Override
    public void draw() {
        System.out.println("Vẽ một hình chữ nhật có chiều rộng " + width + " và chiều dài " + length);

    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides. ");
    }
}