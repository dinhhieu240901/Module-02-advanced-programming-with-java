package com.codegym.baitap.Display_Odd_Even_Number;

public class TestThread {
  public static void main(String[] args) {
    OddThread oddThread = new OddThread();
    EvenThread evenThread = new EvenThread();
    oddThread.start();
    try {
      oddThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
      evenThread.start();
      System.out.println("Main thread run is over");
  }
}
