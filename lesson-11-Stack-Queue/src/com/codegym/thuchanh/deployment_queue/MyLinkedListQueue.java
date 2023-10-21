package com.codegym.thuchanh.deployment_queue;

import java.util.LinkedList;

class Node {

  public int key;
  public Node next;

  public Node(int key) {
    this.key = key;
    this.next = null;
  }
}

public class MyLinkedListQueue<T> {

  private Node head;
  private Node size;

  public MyLinkedListQueue() {
    this.head = null;
    this.size = null;
  }

  public void enqueue(int key) {
    Node temp = new Node(key);
    if (this.head == null) {
      this.head = temp;
      this.size = temp;
    } else {
      this.size.next = temp;
      this.size = temp;
    }
  }

  public Node dequeue() {
    if (this.head == null) {
      return null;
    }
    Node temp = this.head;
    this.head = this.head.next;
    if (this.head == null) {
      this.size = null;
    }
    return temp;
  }
}
