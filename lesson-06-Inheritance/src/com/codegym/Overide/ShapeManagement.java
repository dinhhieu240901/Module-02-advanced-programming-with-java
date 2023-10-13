package com.codegym.Overide;

public class ShapeManagement {
    public static void main(String[] args) {
        Shape shape = new Shape("abc");
        shape.getName();
        Rectangle rectangle = new Rectangle("rectangle");
        rectangle.getName();
        Rectangle rec4 = new Rectangle("abc");
        ((Shape) rec4).getName();
        Shape shape2 = (Shape) new Rectangle("rectangle");
        shape2.getName();
        Shape shape3 = new Shape("shape3");
//        ((Rectangle)shape3).getName();
    }
}
