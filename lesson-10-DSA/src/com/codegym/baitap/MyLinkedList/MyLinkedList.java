package com.codegym.baitap.MyLinkedList;
public class MyLinkedList<E> {
  private Node head;
  private int size = 0;

  private class Node {
    E data;
    Node next;

    Node(E data) {
      this.data = data;
    }
  }

  public MyLinkedList() {
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }
  public void addFirst(E element) {
    Node newNode = new Node(element);
    newNode.next = head;
    head = newNode;
    size++;
  }
  public void addLast(E element) {
    Node newNode = new Node(element);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
    size++;
  }
  public void add(E element) {
    Node newNode = new Node(element);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
    size++;
  }

  public boolean remove(E element) {
    if (head == null) {
      return false; // Danh sách rỗng
    }
    if (head.data.equals(element)) {
      head = head.next;
      size--;
      return true;
    }
    Node current = head;
    while (current.next != null) {
      if (current.next.data.equals(element)) {
        current.next = current.next.next;
        size--;
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    Node current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.data;
  }
  public boolean contains(E element) {
    Node current = head;
    while (current != null) {
      if (current.data.equals(element)) {
        return true;
      }
      current = current.next;
    }
    return false;
  }
  public int indexOf(E element) {
    Node current = head;
    int index = 0;
    while (current != null) {
      if (current.data.equals(element)) {
        return index;
      }
      index++;
      current = current.next;
    }
    return -1;
  }
}
