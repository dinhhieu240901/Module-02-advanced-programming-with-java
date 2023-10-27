package com.codegym.baitap.Optional_Prime_Number;

public class OptimizedPrimeFactorization implements Runnable {

  public void run() {
    try {
      double start = System.currentTimeMillis();
      for (int i = 2; i <= 30; i++) {
        if (isPrime(i)) {
          double end = System.currentTimeMillis();
          System.out.println(
                  "OptimizedPrimeFactorization: " + i + " time: " + (end - start) + " "
          );
        }
//        Thread.sleep(100);
      }
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }

  private boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    int sqrt = (int) Math.sqrt(number);
    for (int i = 2; i <= sqrt; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
