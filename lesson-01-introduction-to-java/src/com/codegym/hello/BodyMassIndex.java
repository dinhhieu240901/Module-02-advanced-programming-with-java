package com.codegym.hello;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is %.1f. You are ", bmi);
        if (bmi < 18.5) {
            System.out.print("underweight.");
        } else if (bmi < 25.0) {
            System.out.print("normal weight.");
        } else if (bmi < 30.0) {
            System.out.print("overweight.");
        } else {
            System.out.print("obese.");
        }
    }
}
