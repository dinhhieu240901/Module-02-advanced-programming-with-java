package com.codegym.baitap.CheckPalindrome;

import java.util.Stack;

public class Palindrome {

  public boolean isPalindrome(String input) {
    Stack<Character> charStack = new Stack<>();
    input = input.toLowerCase();
    for (char c : input.toCharArray()) {
      charStack.push(c);
    }
    int length = charStack.size();
    for (int i = 0; i < length / 2; i++) {
      if (charStack.pop() != charStack.get(i)) {
        return false;
      }
    }
    return true;
  }

  public boolean isPalindrome1(String s) {
    s = s.toLowerCase();
    int i = 0, j = s.length() - 1;
    while (i <= j) {
      if (s.charAt(i++) != s.charAt(j--)) {
        return false;
      }
    }
    return true;
  }
}
