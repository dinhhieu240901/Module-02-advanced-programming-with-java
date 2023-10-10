package com.codegym.thuchanh.check_prime2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
        // In số nguyên tố từ 2 đến n
        // int countPrime = 0;
        // for (int i = 2; i <= number; i++) {
        // int countDivisor = 0;
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // countDivisor++;
        // }
        // }
        // if (countDivisor == 2) {
        // countPrime++;
        // System.out.print(i + " ");
        // }
        // }
        // System.out.println("\nThere are " + countPrime + " prime numbers from 1 to "
        // + number);
    }
}
