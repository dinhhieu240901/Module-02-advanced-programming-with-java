package com.codegym.baitap.Display_Prime_Number;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            boolean isPrime = true; 
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

    }
}
