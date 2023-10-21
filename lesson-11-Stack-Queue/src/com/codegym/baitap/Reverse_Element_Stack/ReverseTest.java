package com.codegym.baitap.Reverse_Element_Stack;

public class ReverseTest {
    public static void main(String[] args) {
        ReverseElement<Integer> reverser = new ReverseElement<>();
        Integer[] array = {1, 2, 3, 4, 5};
        reverser.reverse(array);
        System.out.print("Mảng đảo ngược: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        ReverseElement<String> nameReverser = new ReverseElement<>();
        String[] names = {"John", "Alice", "Bob", "Eve", "Charlie"};
        nameReverser.reverse(names);
        System.out.print("Mảng tên đảo ngược: ");
        nameReverser.printArray(names);
    }
}
