package com.codegym.baitap.Resizeable_Interface.Shape_Inheritance;

public class ResizableTest {

  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0, 6.0);
    Square square = new Square(3.0);
    System.out.println("Kích thước ban đầu:");
    System.out.println("Circle Area: " + circle.getArea());
    System.out.println("Rectangle Area: " + rectangle.getArea());
    System.out.println("Square Area: " + square.getArea());

    double percent = 50.0;
    circle.resize(percent);
    rectangle.resize(percent);
    square.resize(percent);
    System.out.println("\nKích thước sau khi tăng " + percent + "%:");
    System.out.println("Circle Area: " + circle.getArea());
    System.out.println("Rectangle Area: " + rectangle.getArea());
    System.out.println("Square Area: " + square.getArea());
    System.out.println("Square Area: " + square.getPerimeter());

    circle.draw();
    rectangle.draw();
    square.draw();
    circle.howToColor();
    rectangle.howToColor();
    square.howToColor();
    System.out.println("\n");
  }
}
