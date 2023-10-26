package com.codegym.thuchanh.Selection_Sort;

public class SelectionSort {

  //khơi tạo một mng double
  static double[] list = { 1, 9, 4.5, 6.6, 5.7, -4.5 };

  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      double currentMin = list[i];
      int index = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < currentMin) {
          currentMin = list[j];
          index = j;
        }
      }
      if (index != i) {
        double temp = list[i];
        list[i] = list[index];
        list[index] = temp;
      }
    }
  }

  public static void main(String[] args) {
    selectionSort(list);
    for (double i : list) {
      System.out.print(i + " ");
    }
  }
}
