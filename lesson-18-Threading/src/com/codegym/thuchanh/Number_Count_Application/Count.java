package com.codegym.thuchanh.Number_Count_Application;

public class Count implements Runnable {

  private final Thread myThread;

  public Count() {
    myThread = new Thread(this, "My runnable thread");
    System.out.println("My thread created" + myThread);
    myThread.start();
  }

  public Thread getThread() {
    return myThread;
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i < 10; i++) {
        System.out.println("Printing the count " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("My thread interrupted");
    }
    System.out.println("My thread run is over");
  }

  public static void main(String[] args) {
    Count count = new Count();
    try {
      while (count.getThread().isAlive()) {
        System.out.println(
          "Main thread will be alive till the child thread is live"
        );

        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Main thread run is over");
    }
    System.out.println("Main thread run is over");
  }
}
