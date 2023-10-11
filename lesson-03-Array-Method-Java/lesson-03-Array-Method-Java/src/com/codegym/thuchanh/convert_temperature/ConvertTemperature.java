package com.codegym.thuchanh.convert_temperature;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Enter Fahrenheit temperature: ");
                fahrenheit = scanner.nextDouble();
                celsius = FahToCel(fahrenheit);
                System.out.println("Celsius temperature is: " + celsius);
                break;
            case 2:
                System.out.print("Enter Celsius temperature: ");
                celsius = scanner.nextDouble();
                fahrenheit = CelToFah(celsius);
                System.out.println("Fahrenheit temperature is: " + fahrenheit);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
            }
        } while (true);

    }

    public static double CelToFah(double cel) {
        return 9.0 / 5 * cel + 32;
    }

    public static double FahToCel(double fah) {
        return (5.0 / 9) * (fah - 32);
    }
}
