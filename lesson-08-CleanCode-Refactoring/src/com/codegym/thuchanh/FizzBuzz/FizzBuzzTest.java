package com.codegym.thuchanh.FizzBuzz;

public class FizzBuzzTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = FizzBuzz.fizzBuzz(i);
            System.out.println("Số " + i + " - " + result);
        }
    }
}
