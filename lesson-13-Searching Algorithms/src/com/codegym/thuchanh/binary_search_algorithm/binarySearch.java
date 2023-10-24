package com.codegym.thuchanh.binary_search_algorithm;

public class binarySearch {

  static int binary_search_algorithm(int[] list, int key) {
    int start = 0;
    int end = list.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (list[mid] == key) {
        return mid;
      } else if (list[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] list = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };

    int key = 10;
    int result = binary_search_algorithm(list, key);
    System.out.println(
      result == -1
        ? "Không tìm thấy " + key
        : "Tìm thấy " + key + " tại vị trí: " + result
    );
  }
}
