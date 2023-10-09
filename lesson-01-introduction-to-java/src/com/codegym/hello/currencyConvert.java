package com.codegym.hello;

import java.util.Scanner;

public class currencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the exchange rate from USD to VND: ");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Enter the amount of USD: ");
        double usdAmount = scanner.nextDouble();
        double vndAmount = usdAmount * exchangeRate;
        System.out.println(usdAmount + " USD is equal to " + vndAmount + " VND");
    }
    
}
