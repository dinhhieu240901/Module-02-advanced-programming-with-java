package com.codegym.baitap.Illustration_Selection_Sort;

import java.util.Scanner;

public class SelectionSort {

  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter list size ");
    int size = Scanner.nextInt();
    double[] list = new double[size];
    System.out.println("Enter" + list.length + "values ");
    for (int i = 0; i < list.length; i++) {
      list[i] = Scanner.nextDouble();
      System.out.print("");
    }
    System.out.println("\nBegin sort processing...");
    selectionSort(list);
  }

  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length; i++) {
      int min = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < list[min]) {
          min = j;
        }
      }
      double temp = list[i];
      list[i] = list[min];
      list[min] = temp;
    }
    for (double v : list) {
      System.out.print(v + " ");
    }
    System.out.println();
  }
}
