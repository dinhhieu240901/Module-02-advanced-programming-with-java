package com.codegym.thuchanh.MyLinkedList;

public class MyLinkedList<E> {

  private Node head;
  private int numNodes = 0;

  public MyLinkedList(E data) {
    head = new Node(data);
    numNodes++;
  }

  public void add(E data) {
    Node temp = head;
    Node holder;

    while (temp.next != null) {
      temp = temp.next;
    }

    holder = new Node(data);
    temp.next = holder;
    numNodes++;
  }

  public void addFirst(E data) {
    Node temp = head;
    head = new Node(data);
    head.next = temp;
    numNodes++;
  }

  public Node get(int index) {
    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  class Node {

    E data;
    Node next;

    public Node(E data) {
      this.data = data;
    }
  }
}
