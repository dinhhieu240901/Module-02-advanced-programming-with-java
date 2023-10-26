package com.codegym.thuchanh.Validate_Account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {

  private static Pattern pattern;

  public ValidateAccount() {

    String ACCOUNT_REGEX = "[_a-z0-9]{6,}$";
    pattern = Pattern.compile(ACCOUNT_REGEX);
  }

  public boolean isValid(String regex) {
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();
  }

  public static void main(String[] args) {
    ValidateAccount validateAccount = new ValidateAccount();
    String[] validAccount = new String[] { "abc_123", "Abc1234" };
    for (String account : validAccount) {
      System.out.println(validateAccount.isValid(account));
    }
  }
}
