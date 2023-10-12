package com.codegym.baitap.sum_specified_column;

import java.util.Scanner;

public class SumSpecifiedColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.floor((Math.random() * 10000))/100;
                System.out.print(matrix[i][j]+"\t");
                //   matrix[i][j] = scanner.nextDouble();
            }
            System.out.println();

        }
        System.out.print("Enter the column index to sum: ");
        int columnIndex = scanner.nextInt();
        if (columnIndex > columns) {
            System.out.println("Invalid column index. Please enter a column index less than " + columns);
            return;
        } else {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][columnIndex - 1];
            }
            System.out.println("Sum of the elements in column " + columnIndex + " is " + sum);
        }
    }
}