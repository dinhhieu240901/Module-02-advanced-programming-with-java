package com.codegym.baitap.sum_diagonal;

import java.util.Scanner;

public class SumDiagonal {
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
                matrix[i][j] =Math.floor(Math.random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(" ");
        }
        double sumDiagonal = 0;
        for (int i = 0; i < rows && i < columns; i++) {
            sumDiagonal += matrix[i][i];
        }
        System.out.println("The sum of the diagonal is: " + sumDiagonal);
    }
}
