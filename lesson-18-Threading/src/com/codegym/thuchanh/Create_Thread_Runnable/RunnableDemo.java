package com.codegym.thuchanh.Create_Thread_Runnable;

public class RunnableDemo implements Runnable {

  private Thread thread;
  private final String threadName;

  public RunnableDemo(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  @Override
  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println(threadName + " : " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread " + threadName + " interrupted");
    }
    System.out.println("Exiting " + threadName);
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (thread == null) {
      thread = new Thread(this, threadName);
      thread.start();
    }
  }

  public static void main(String[] args) {
    System.out.println("Main thread running...");
    RunnableDemo runnableDemo = new RunnableDemo("Thread-1-HR-Database");
    runnableDemo.start();
    RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
    runnableDemo2.start();
    System.out.println("Main thread stopped");
  }
}
