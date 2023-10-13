package com.codegym.baitap.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = " + getRadius() + ", color = " + getColor() + ", height = " + height + ", and volume = " + getVolume();
    }
}
