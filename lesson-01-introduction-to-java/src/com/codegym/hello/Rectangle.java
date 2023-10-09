package com.codegym.hello;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextFloat();
        System.out.print("Enter the height: ");
        double height = scanner.nextFloat();
        double area = width * height;
        System.out.println("Area of the rectangle is: " + area);
    }
}
