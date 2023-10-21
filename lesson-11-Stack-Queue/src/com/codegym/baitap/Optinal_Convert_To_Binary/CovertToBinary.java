package com.codegym.baitap.Optinal_Convert_To_Binary;

import java.util.Stack;

public class CovertToBinary<E> {

  private Stack<Integer> stack = new Stack<>();

  public int CovertDecimalToBinary(int decimal) {
    while (decimal != 0) {
      stack.push(decimal % 2);
      decimal /= 2;
    }
    int binary = 0;
    while (!stack.isEmpty()) {
      binary = (binary * 10 + stack.pop());
    }
    return binary;
  }

  public int ConvertBinaryToDecimal(long binary) {
    int decimal = 0; //biến lưu trữ kết quá
    int n = 0;

    while (binary != 0) {
      long temp = binary % 10;
      decimal += (int) (temp * Math.pow(2, n));
      binary /= 10;
      n++;
    }
    return decimal;
  }

  public String ConvertDecimalToHexDecimal(long numberInput) {
    StringBuilder hexDecimal = new StringBuilder();
    String hexDigits = "0123456789ABCDEF";
    while (numberInput != 0) {
      int remainder = (int) (numberInput % 16);
      hexDecimal.append(hexDigits.charAt(remainder));
      numberInput /= 16;
    }
    return hexDecimal.toString();
  }

  public int ConvertHexDecimalToDecimal(String hexDecimal) {
    int decimal = 0; //biến lưu trữ kết quá
    int n = 0;
    String hexDigits = "0123456789ABCDEF";
    for (int i = hexDecimal.length() - 1; i >= 0; i--) {
      int remainder = hexDigits.indexOf(hexDecimal.charAt(i));
      decimal += (int) (remainder * Math.pow(16, n));
      n++;
    }
    return decimal;
  }
}
