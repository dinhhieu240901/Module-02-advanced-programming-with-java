package com.codegym.thuchanh.apj_find_maximum_subsequence;

import java.util.Scanner;

public class maximumSubsequence {

    public static String maximumSub(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Chuỗi đâu có được rỗng đâu ~~ .");
        }
        int n = input.length();
        StringBuilder currentSubstring = new StringBuilder();
        char result = input.charAt(0);
        currentSubstring.append(result);
        for (int i = 1; i < n; i++) {
            if (input.charAt(i) > result) {
                currentSubstring.append(input.charAt(i));
                result = input.charAt(i);
            }
        }
        return currentSubstring.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println(
                "The maximum increasing subsequence is: " + maximumSub(input)
        );
    }
}
