package com.codegym.baitap.Shape;

import java.util.Scanner;

public class ShapeManagement {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhập độ dài cạnh 1: ");
    double side1 = scanner.nextDouble();
    System.out.print("Nhập độ dài cạnh 2: ");
    double side2 = scanner.nextDouble();
    System.out.print("Nhập độ dài cạnh 3: ");
    double side3 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Nhập màu sắc của tam giác: ");
    String color = scanner.nextLine();

    Triangle triangle = new Triangle(side1, side2, side3, color);
    triangle.setColor(color);

    System.out.println("Thông tin về tam giác:");
    System.out.println(triangle);
    System.out.println("Diện tích: " + triangle.getArea());
    System.out.println("Chu vi: " + triangle.getPerimeter());

    scanner.close();
  }
}
