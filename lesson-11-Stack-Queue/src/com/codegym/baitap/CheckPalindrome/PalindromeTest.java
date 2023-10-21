package com.codegym.baitap.CheckPalindrome;

public class PalindromeTest {

  public static void main(String[] args) {
    Palindrome palindrome = new Palindrome();
    String input = "A man, a plan, a canal, Panama";
    boolean isPalindrome = palindrome.isPalindrome(input);
    if (isPalindrome) {
      System.out.println("Chuỗi là Palindrome.");
    } else {
      System.out.println("Chuỗi không phải Palindrome.");
    }
  }
}
