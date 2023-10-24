package com.codegym.thuchanh.Number_Format_exception;

import java.util.Scanner;

public class NumberFormatException extends Throwable {

  //Tạo lớp CalculationExample
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter x : ");
    int x = scanner.nextInt();
    System.out.println(x);
    System.out.println("Enter y : ");
    int y = scanner.nextInt();
    System.out.println(y);
    CalculationExample(x, y);
    scanner.close();
  }

  private static void CalculationExample(int x, int y) {
    try {
      int a = x + y;
      int b = x - y;
      int c = x * y;
      int d = x / y;
      System.out.println("Tổng của x + y " + a);
      System.out.println("Hiệu của x - y " + b);
      System.out.println("Tích của x * y " + c);
      System.out.println("Thương của x / y " + d);
    } catch (Exception e) {
        System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
    }
  }
}
