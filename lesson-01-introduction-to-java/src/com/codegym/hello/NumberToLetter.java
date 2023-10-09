package com.codegym.hello;

import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();
        int numLength = num.length();
        // String result = "";
        // String[] number = {"", "one", "two", "three", "four", "five", "six", "seven",
        // "eight", "nine", "ten",
        // "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        // "seventeen", "eighteen",
        // "nineteen"};
        // String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
        // "seventy", "eighty", "ninety"};
        // String[] unit = {"", "", "hundred", "thousand"};

        // for (int i = numLength; i > 0; i--) {
        // int x = Integer.parseInt(String.valueOf(num.charAt(numLength - i)));

        // if (i == 2) {
        // if (x == 1) {
        // result += number[Integer.parseInt(num.substring(numLength - 2))];
        // break;
        // } else {
        // result += tens[x] + " ";
        // }
        // } else {
        // result += number[x] + " " + unit[i - 1] + " ";
        // }
        // }
        // System.out.println(result);
        String[] thousands = { "", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand",
                "six thousand", "seven thousand", "eight thousand", "nine thousand" };
        String[] hundreds = { "", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred" };
        String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] special = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };

        int numInt = Integer.parseInt(num);
        String[] numStr = num.split("");
        String result = "";

        switch (numLength) {
        case 1:
            result = ones[numInt];
            break;
        case 2:
            if (numInt < 10) {
                result = ones[numInt];
            } else if (numInt < 20) {
                result = special[numInt - 10];
            } else {
                result = tens[Integer.parseInt(numStr[0])] + " " + ones[Integer.parseInt(numStr[1])];
            }
            break;
        case 3:
            if (numInt % 100 == 0) {
                result = hundreds[Integer.parseInt(numStr[0])] + " ";
            } else if (numInt % 10 == 0) {
                result = hundreds[Integer.parseInt(numStr[0])] + " " + tens[Integer.parseInt(numStr[1])] + " ";
            } else if (numInt % 100 < 10) {
                result = hundreds[Integer.parseInt(numStr[0])] + " and " + ones[Integer.parseInt(numStr[2])];
            } else if (numInt % 100 < 20) {
                result = hundreds[Integer.parseInt(numStr[0])] + " and " + special[numInt % 100 - 10];
            } else {
                result = hundreds[Integer.parseInt(numStr[0])] + " " + tens[Integer.parseInt(numStr[1])] + " "
                        + ones[Integer.parseInt(numStr[2])];
            }
            break;
        }

        System.out.println(result);
    }
}
