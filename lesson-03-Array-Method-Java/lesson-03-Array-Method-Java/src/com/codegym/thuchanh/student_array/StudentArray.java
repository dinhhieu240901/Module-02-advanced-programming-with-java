package com.codegym.thuchanh.student_array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        // String[] studentNames = new String[size];
        // for (int j = 0; j < size; j++) {
        // System.out.print("Enter student name " + (j + 1) + ": ");
        // studentNames[j] = scanner.next();
        // }
        // System.out.print("Enter student name to search: ");
        // String searchName = scanner.next();
        // boolean found = false;
        // for (int j = 0; j < size; j++) {
        // if (studentNames[j].equals(searchName)) {
        // System.out.println("Position of student " + searchName + " in the list is " +
        // (j + 1));
        // found = true;
        // break;
        // }
        // }
        // if (!found) {
        // System.out.println("Student " + searchName + " not found in the list.");
        // }
        //
        String[] studentNames = new String[size];
        for (int j = 0; j < size; j++) {
            System.out.print("Enter student name " + (j + 1) + ": ");
            studentNames[j] = scanner.next();
        }
        System.out.print("Enter student name to search: ");
        String searchName = scanner.next();
        boolean found = false;
        for (int j = 0; j < size; j++) {
            if (studentNames[j].compareTo(searchName) == 0) {
                System.out.println("Position of student " + searchName + " in the list is " + (j + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + searchName + " not found in the list.");
        }

    }
}
