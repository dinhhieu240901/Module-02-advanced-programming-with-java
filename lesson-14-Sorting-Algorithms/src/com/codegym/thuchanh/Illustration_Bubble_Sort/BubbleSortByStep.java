package com.codegym.thuchanh.Illustration_Bubble_Sort;

import java.util.Scanner;

public class BubbleSortByStep {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter list size: ");
      int size = scanner.nextInt();
      int[] list = new int[size];

      for (int i = 0; i < size; i++) {
          System.out.println("Enter element " + i);
          int element = scanner.nextInt();
          list[i] = element;
      }

      System.out.print("List before sorting: ");
      for (int i : list) {
          System.out.print(i + "\t");
      }

      bubbleSortByStep(list);
      System.out.print("List after sorting: ");
      for (int i : list) {
          System.out.print(i + "\t");
      }
  }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        int k = 0;

        while (needNextPass) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i+1]) {
                    System.out.println("\tSwap " + list[i] +" and " + list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }

            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
            }

            System.out.print("List after the " + k + " sort: ");
            for (int j : list) {
                System.out.print(j + "\t");
            }
            System.out.println();
            k++;
        }
    }

}
