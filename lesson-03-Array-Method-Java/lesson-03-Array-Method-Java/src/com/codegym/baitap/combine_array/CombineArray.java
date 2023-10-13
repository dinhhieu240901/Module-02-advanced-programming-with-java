        package com.codegym.baitap.combine_array;

    import java.util.Scanner;

    public class CombineArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the first array: ");
            int size1 = scanner.nextInt();
            int[] array1 = InputArray(size1, "first");

            System.out.print("Enter the size of the second array: ");
            int size2 = scanner.nextInt();
            int[] array2 = InputArray(size2, "second");

            int[] combinedArray = CombineArrays(array1, array2);
            PrintArray(combinedArray);
        }

        public static int[] InputArray(int size, String ordinal) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[size];

            System.out.println("Enter values for the " + ordinal + " array: ");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            return array;
        }

        public static int[] CombineArrays(int[] array1, int[] array2) {
            int size1 = array1.length;
            int size2 = array2.length;
            int[] combinedArray = new int[size1 + size2];

            for (int i = 0; i < size1; i++) {
                combinedArray[i] = array1[i];
            }
            for (int i = 0; i < size2; i++) {
                combinedArray[size1 + i] = array2[i];
            }

            return combinedArray;
        }

        public static void PrintArray(int[] array) {
            System.out.println("The new array is: ");
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
