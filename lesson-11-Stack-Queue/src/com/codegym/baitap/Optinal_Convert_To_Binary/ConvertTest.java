package com.codegym.baitap.Optinal_Convert_To_Binary;

public class ConvertTest {

  public static void main(String[] args) {
    CovertToBinary<Integer> c = new CovertToBinary<>();
    System.out.println(c.CovertDecimalToBinary(10));
    System.out.println(c.ConvertBinaryToDecimal(1000));
    System.out.println(c.ConvertDecimalToHexDecimal(10));
    System.out.println(c.ConvertHexDecimalToDecimal("B"));
  }
}
