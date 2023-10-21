package com.codegym.baitap.checkBracket;

public class CheckBracketTest {

  public static void main(String[] args) {
    String input1 = "((()))"; // Hợp lệ
    String input2 = "(()())"; // Hợp lệ
    String input3 = "(()))("; // Không hợp lệ

    System.out.println(
      "Input 1 is valid: " + CheckBracket.checkBracket(input1)
    );
    System.out.println(
      "Input 2 is valid: " + CheckBracket.checkBracket(input2)
    );
    System.out.println(
      "Input 3 is valid: " + CheckBracket.checkBracket(input3)
    );
  }
}
