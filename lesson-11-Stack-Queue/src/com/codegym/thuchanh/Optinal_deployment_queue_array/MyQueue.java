package com.codegym.thuchanh.Optinal_deployment_queue_array;

public class MyQueue {

  private final int capacity;
  private final int[] queueArr;
  private int tail = -1;
  private int head = 0;
  private int currentSize = 0;

  public MyQueue(int queueSize) {
    this.capacity = queueSize;
    queueArr = new int[this.capacity];
  }

  public boolean isQueueFull() {
    return currentSize == capacity;
  }

  public boolean isQueueEmpty() {
    return currentSize == 0;
  }

  public void enqueue(int item) {
    if (isQueueFull()) {
      System.out.println("Overflowing queue! Unable to add element " + item);
    } else {
      tail++;
      if (tail == capacity) {
        tail = 0;
      }
      queueArr[tail] = item;
      currentSize++;
      System.out.println("Element " + item + " is pushed to the queue");
    }
  }

  public void dequeue() {
    if (isQueueEmpty()) {
      System.out.println("Underflowing queue! Unable to remove element");
    } else {
      int removedItem = queueArr[head];
      head++;
      if (head == capacity) {
        head = 0;
      }
      currentSize--;
      System.out.println("Pop operation done! Removed: " + removedItem);
    }
  }

  public String toBinary(int decimal) {
    if (decimal < 0) {
      return Integer.toBinaryString(-decimal);
    }
    return Integer.toBinaryString(decimal);
  }

}
