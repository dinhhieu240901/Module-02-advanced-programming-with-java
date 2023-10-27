package com.codegym.baitap.Create_Simple_Thread;

public class NumberGenerator implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(
        "Các số tự nhiên đầu tiên là:  " + i + " " + Thread.currentThread().hashCode()
      );
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    Thread thread1 = new Thread(new NumberGenerator());
    Thread thread2 = new Thread(new NumberGenerator());
    thread1.setPriority(Thread.MAX_PRIORITY);
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread1.start();
    thread2.start();
    System.out.println("Main thread run is over");
  }
}
