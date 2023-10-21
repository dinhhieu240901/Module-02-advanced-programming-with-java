package com.codegym.thuchanh.Optinal_deployment_queue_array;

public class MyQueueTest {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue(4);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    queue.dequeue();
    queue.dequeue();
    System.out.println(queue.toBinary(1000));
  }
}
