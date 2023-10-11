package com.codegym.baitap.Remove_element_from_array;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a size:");

        // int n = scanner.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter element " + (i + 1) + ": ");
        // arr[i] = scanner.nextInt();
        // }
        // System.out.print("Nhập X là phần tử cần xoá: ");
        // int x = scanner.nextInt();

        // int index_del = -1;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] == x) {
        // index_del = i;
        // break;
        // }
        // }
        // if (index_del != -1) {
        // System.out.println("X appears at index: " + index_del);
        // } else {
        // System.out.println("X does not appear in the array.");
        // }
        // int[] newArr = new int[n - 1];
        // int index = 0;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] != x) {
        // newArr[index] = arr[i];
        // index++;
        // }
        // }
        // arr = newArr;
        // System.out.println("Các phần tử trong mảng sau khi xóa:");
        // for (int j = 0; j < n - 1; j++) {
        // System.out.println(arr[j]);
        // }
        // int N = scanner.nextInt();
        // int[] array = new int[N];
        //
        // for (int i = 0; i < N; i++) {
        // System.out.print("Enter element " + (i + 1) + ": ");
        // array[i] = scanner.nextInt();
        // }
        // System.out.print("Nhập X là phần tử cần xoá: ");
        //
        // int X = scanner.nextInt();
        //
        // int index_del = -1;
        // for (int i = 0; i < N; i++) {
        // if (array[i] == X) {
        // index_del = i;
        // break;
        // }
        // }
        // if (index_del != -1) {
        // System.out.println("Index of " + X + " is " + index_del);
        // } else {
        // System.out.println(X + " not found in the array");
        // }
        // if (index_del != -1) {
        // for (int i = index_del; i < N - 1; i++) {
        // array[i] = array[i + 1];
        // }
        // N--;
        // }
        // System.out.println("Các phần tử trong mảng sau khi xóa:");
        //
        // for (int i = 0; i < N; i++) {
        // System.out.print(array[i] + " ");
        // }
        // scanner.close();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value to delete: ");
        int valueToDelete = scanner.nextInt();
        int[] tempArr = new int[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != valueToDelete) {
                tempArr[count] = arr[i];
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Value not found in array.");
        } else {
            System.out.print("Array after deletion: ");
            for (int i = 0; i < count; i++) {
                System.out.print(tempArr[i] + " ");
            }
        }
    }
}
