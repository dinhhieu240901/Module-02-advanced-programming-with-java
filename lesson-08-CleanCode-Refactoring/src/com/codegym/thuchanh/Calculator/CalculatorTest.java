package com.codegym.thuchanh.Calculator;


public class CalculatorTest{
    public static void main(String[] args) {

        System.out.printf("Testing addition\n1 + 1 = %d\nTesting subtraction\n2 - 1 = %d\nTesting multiplication\n2 * 2 = %d\nTesting division\n6 / 3 = %d",
                Calculator.calculate(1, 1, '+'),
                Calculator.calculate(2, 2, '-'),
                Calculator.calculate(4, 1, '*'),
                Calculator.calculate(5, 5, '/')
        );

    }

}