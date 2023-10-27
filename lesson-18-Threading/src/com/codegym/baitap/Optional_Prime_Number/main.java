package com.codegym.baitap.Optional_Prime_Number;

public class main {

  public static void main(String[] args) {
    Runnable lazyPrimeFactorization = new LazyPrimeFactorization();
    Runnable optimizedPrimeFactorization = new OptimizedPrimeFactorization();
    new Thread(lazyPrimeFactorization).start();
    new Thread(optimizedPrimeFactorization).start();
//    try {
//      Thread.sleep(1000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
  }
}
