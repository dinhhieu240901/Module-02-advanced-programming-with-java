package com.codegym.thuchanh.reverse_array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] reverseArray;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        reverseArray = new int[size];
        int i = 0;
        while (i < size) {
            System.out.printf("Enter an element: %d :", i + 1);
            reverseArray[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(reverseArray[j] + "\t");
        }
        for (int j = 0; j < size / 2; j++) {
            int temp = reverseArray[j];
            reverseArray[j] = reverseArray[size - 1 - j];
            reverseArray[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(reverseArray[j] + "\t");
        }

    }
}
