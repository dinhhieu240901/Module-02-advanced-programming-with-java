package com.codegym.baitap.Implement_Queue;

class Node {

  public int data;
   public Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class Queue {

  private Node front;
  private Node rear;

  public Queue() {
    front = null;
    rear = null;
  }

  public void enQueue(int data) {
    Node newNode = new Node(data);
    if (isEmpty()) {
      front = newNode;
    } else {
      rear.next = newNode;
    }
    rear = newNode;
    rear.next = front;
  }

  public void deQueue() {
    if (isEmpty()) {
      return;
    }
    int data = front.data;
    if (front == rear) {
      front = rear = null;
    } else {
      front = front.next;
      rear.next = front;
    }
  }

  public boolean isEmpty() {
    return front == null;
  }

  public void printQueue() {
    if (isEmpty()) {
      System.out.println("Hàng đợi trống.");
      return;
    }

    Node current = front;
    do {
      System.out.print(current.data + " ");
      current = current.next;
    } while (current != front);
    System.out.println();
  }

  public static void main(String[] args) {
    Queue queue = new Queue();

    queue.enQueue(1);
    queue.enQueue(2);
    queue.enQueue(3);


    queue.printQueue(); // 1. 2.3

    queue.deQueue();

    queue.printQueue(); // 2,3
  }
}
