package com.codegym.thuchanh.count_student_pass;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();
        while (size > 30) {
            System.out.println("Size must be less than or equal to 30. Please enter again: ");
            size = scanner.nextInt();
        }
        int[] scores = new int[size];
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            if (scores[i] >= 5) {
                count++;
            }
        }
        System.out.println("Number of students who passed: " + count);
    }
}
