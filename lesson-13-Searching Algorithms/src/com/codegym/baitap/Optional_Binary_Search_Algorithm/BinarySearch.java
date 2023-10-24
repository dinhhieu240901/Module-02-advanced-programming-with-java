package com.codegym.baitap.Optional_Binary_Search_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    // Bước 1: Khởi tạo một mảng bất kì
    int[] array = { 5, 8, 2, 10, 1, 6, 3 };

    // Bước 2: Sắp xếp lại mảng từ bé đến lớn
    Arrays.sort(array);

    // Giá trị cần tìm kiếm
    int value = 6;

    // Gọi hàm tìm kiếm nhị phân
    int index = binarySearch(array, 0, array.length - 1, value);

    // Kiểm tra kết quả
    if (index == -1) {
      System.out.println("Không tìm thấy giá trị trong mảng.");
    } else {
      System.out.println(
        "Giá trị " +
        value +
        " được tìm thấy tại vị trí " +
        index +
        " trong mảng."
      );
    }
  }

  // Hàm tìm kiếm nhị phân sử dụng đệ quy
  public static int binarySearch(int[] array, int left, int right, int value) {
    if (left <= right) {
      // Bước 4: Tính giá trị middle
      int middle = (left + right) / 2;

      // Bước 5: So sánh giá trị tại vị trí middle với value
      if (array[middle] == value) {
        return middle;
      }
      // Bước 6: value > array[middle]
      if (value > array[middle]) {
        return binarySearch(array, middle + 1, right, value);
      }

      // Bước 7: value < array[middle]
      if (value < array[middle]) {
        return binarySearch(array, left, middle - 1, value);
      }
    }
    return -1;
    // Bước 8: Không tìm thấy giá trị trong mảng
  }
}