package com.codegym.ToString;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "The circle has a radius of: " + radius ;
    }
}
