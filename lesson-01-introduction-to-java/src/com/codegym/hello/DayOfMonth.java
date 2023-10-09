package com.codegym.hello;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        int daysInMonth;
        boolean isLeapYear;

        switch (month) {
        case 4:
        case 6:
        case 9:
        case 11:
            daysInMonth = 30;
            break;
        case 2:
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();
            isLeapYear = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }
            if (isLeapYear) {
                daysInMonth = 29;
            } else {
                daysInMonth = 28;
            }
            break;
        default:
            if (month < 1 || month > 12) {
                System.out.println("Invalid input");
                return;
            }
            daysInMonth = 31;
            break;
        }
        System.out.printf("The month '%d' has %d days!", month, daysInMonth);
    }
}
