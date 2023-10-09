package com.codegym.hello;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        float a = scanner.nextFloat();
        System.out.println("Enter b: ");
        float b = scanner.nextFloat();
        System.out.println("Enter c: ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == c) {
                System.out.println("the solution is all x ");
            } else {
                System.out.println("No solution");
            }
        } else {
            float answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }

    }
}
