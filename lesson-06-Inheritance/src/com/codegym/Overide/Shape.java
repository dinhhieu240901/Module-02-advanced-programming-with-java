package com.codegym.Overide;

public class Shape {
    private final String name;
    public Shape(String name) {
        this.name=name;
    }

    protected void getName() {
        System.out.println("I am "+this.name);
    }

}
