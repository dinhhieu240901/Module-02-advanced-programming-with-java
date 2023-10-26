package com.codegym.baitap.Insertion_Sort;

import java.util.Scanner;

public class InsertionSort {

  public static void insertionSort(int[] list) {
    for (int i = 1; i < list.length; i++) {
      int currentMin = list[i];
      int j;
      //      while (j > 0 && list[j] < list[j - 1]) {
      //        int temp = list[j];
      //        list[j] = list[j - 1];
      //        list[j - 1] = temp;
      //        j--;
      //      }
      for (j = i - 1; list[j] > currentMin; j--) {
        list[j + 1] = list[j];
      }
      list[j + 1] = currentMin; 
    }
  }

  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Enter list size ");
    int size = Scanner.nextInt();
    int[] list = new int[size];
    System.out.println("Enter" + list.length + "values ");
    for (int i = 0; i < list.length; i++) {
      list[i] = Scanner.nextInt();
      System.out.print("");
    }
    System.out.println("\nBegin sort processing...");
    insertionSort(list);
    for (int i : list) {
      System.out.print(i + " ");
    }
  }
}
