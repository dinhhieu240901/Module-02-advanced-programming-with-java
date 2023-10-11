package com.codegym.thuchanh.find_min_element;
import java.util.Scanner;
public class FindMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int index = 0 ;
        for (int j = 1; j < array.length; j++) {
            if (array[j] < array[index]) {
                index = j;
            }
        }
        System.out.println("The smallest element in the array is: " + array[index]);


    }
}
