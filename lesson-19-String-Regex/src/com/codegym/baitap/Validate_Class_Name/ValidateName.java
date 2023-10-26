package com.codegym.baitap.Validate_Class_Name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {

    private static Pattern pattern;

    public static void validateName() {
        pattern = Pattern.compile("^[CAP]\\d{4}[GHIK]$");
    }

    public static boolean isValid(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        validateName();
        System.out.println(isValid("C0223G"));
        System.out.println(isValid("A0323K"));
        System.out.println(isValid("M0318G"));
        System.out.println(isValid("P0323A"));

    }
}
