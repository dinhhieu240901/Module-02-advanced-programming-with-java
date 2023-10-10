package com.codegym.baitap.Draw_Geometries;

import java.util.Scanner;

public class Geometries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Print the square");
            System.out.println("5. Print the rectangle");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                // Cách 1
                // System.out.print("Enter height: ");
                // int heightIsoTriangle = scanner.nextInt();
                // for (int i = 0; i < heightIsoTriangle; i++) {
                // for (int j = 0; j < heightIsoTriangle - i; j++) {
                // System.out.print(" ");
                // }
                // for (int j = i; j > 0; j--) {
                // System.out.print("* ");
                // }
                // System.out.println();
                // }
                // Cách 2
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Print the square");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}
