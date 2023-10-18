package com.codegym.baitap.Circle_Cylinder;

public class CircleTest {

  public static void main(String[] args) {
    Circle circle1 = new Circle(3.0, "red");
    Circle circle2 = new Circle();
    System.out.println("Circle 1: " + circle1);
    System.out.println("Circle 2: " + circle2);

    circle2.setRadius(5.0);

    System.out.println("Updated Circle 2: " + circle2);

    double area1 = circle1.getArea();
    System.out.println("Area of Circle 1: " + area1);

    double area2 = circle2.getArea();
    System.out.println("Area of Circle 2: " + area2);
  }
}
