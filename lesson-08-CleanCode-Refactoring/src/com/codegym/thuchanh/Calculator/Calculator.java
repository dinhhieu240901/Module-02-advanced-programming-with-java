package com.codegym.thuchanh.Calculator;

public class Calculator {

    public static final char OPERATOR_ADD = '+';
    public static final char OPERATOR_SUB = '-';
    public static final char OPERATOR_MUL = '*';
    public static final char OPERATOR_DIV = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case OPERATOR_ADD:
                return firstOperand + secondOperand;
            case OPERATOR_SUB:
                return firstOperand - secondOperand;
            case OPERATOR_MUL:
                return firstOperand * secondOperand;
            case OPERATOR_DIV:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}