package com.codegym.thuchanh.deployment_stack;

public class GenericStackClient2 {

  public static void main(String[] args) {
    MyGenericStack2<Integer> stack = new MyGenericStack2<>();

    final int NUMBER_OF_PRIMES = 50;
    int count = 0;
    for (int i = 2; count < NUMBER_OF_PRIMES; i++) {
      if (isPrime(i)) {
        stack.push(i);
        count++;
      }
    }
    System.out.println("The first 50 prime numbers in descending order: ");
    for (int i = 1; !stack.isEmpty(); i++) {
      if (i % 10 == 0) System.out.printf(
        "%3d\n",
        stack.pop()
      ); else System.out.printf("%3d ", stack.pop());
    }
    System.out.println();
  }

  public static boolean isPrime(int i) {
    for (int j = 2; j < i; j++) {
      if (i % j == 0) return false;
    }
    return true;
  }
}
