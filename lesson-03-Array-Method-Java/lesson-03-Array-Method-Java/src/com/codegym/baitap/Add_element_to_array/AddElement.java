package com.codegym.baitap.Add_element_to_array;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");

        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập giá trị của các phần tử: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi thêm phần tử là:  ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("Nhập số muốn thêm vào mảng: ");
        int input = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm phần tử: ");
        int position = scanner.nextInt();
        int[] newArray = new int[size + 1];
        int newIndex = 0;
        if (position < 1 || position > size + 1) {
            System.out.println("Không thể thêm giá trị tại vị trí: " + position);
        } else {
            for (int i = 0; i < size; i++) {
                if (i == position - 1) {
                    newArray[newIndex] = input;
                    newIndex++;
                }
                newArray[newIndex] = array[i];

                newIndex++;
            }
            if (position == array.length + 1) {
                newArray[newArray.length - 1] = input;
            }
            System.out.println("Mảng mới là: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


    }
}
