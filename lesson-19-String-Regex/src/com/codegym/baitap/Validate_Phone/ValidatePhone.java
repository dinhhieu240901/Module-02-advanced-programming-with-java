package com.codegym.baitap.Validate_Phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {

  private static Pattern pattern;

  public static void validateName() {
    pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
  }

  public static boolean isValid(String regex) {
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();
  }

  public static void main(String[] args) {
    validateName();
    System.out.println(isValid("(84)-(0978489648)"));
    System.out.println(isValid("84-22b22222"));
    System.out.println(isValid("84-0978489648"));
    System.out.println(isValid("84-22222222"));
  }
}
