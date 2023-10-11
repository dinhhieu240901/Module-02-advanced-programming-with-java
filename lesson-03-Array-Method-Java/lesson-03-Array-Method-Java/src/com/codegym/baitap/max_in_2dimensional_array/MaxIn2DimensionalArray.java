package com.codegym.baitap.max_in_2dimensional_array;

import java.util.Scanner;

public class MaxIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];
        double max = matrix[0][0];
        int rowMax = 0;
        int columnMax = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = Math.floor(Math.random() * 10000) / 100;
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowMax = i;
                    columnMax = j;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The maximum value is " + max + " at position [" + rowMax + "][" + columnMax + "]");
    }
}
