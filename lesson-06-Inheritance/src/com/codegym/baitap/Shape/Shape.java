package com.codegym.baitap.Shape;

public class Shape {
    private String color;

    public Shape() {
        color = "unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
}

