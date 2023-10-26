package com.codegym.thuchanh.Validate_Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
  private static Pattern pattern;
  public ValidateEmail() {
    String EMAIL_REGEX = "[A-Za-z0-9]+@([A-Za-z0-9])+(\\.[A-Za-z0-9]{2,4})$";
    pattern = Pattern.compile(EMAIL_REGEX);
  }

  public boolean isValid(String regex) {
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();

  }

  public static void main(String[] args) {
    ValidateEmail validateEmail = new ValidateEmail();
    String[] validEmail = new String[]{"a@gmail.com.vn", "ab@yahoo.com", "abc@hotmail.com"};
    for (String email : validEmail) {
      System.out.println(validateEmail.isValid(email));
    }
  }
}
