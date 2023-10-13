package com.codegym.Circle;

public class Circle {
    private double radius = 1.0;
    protected  String color = "red";

    Circle() {

    }

    Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}