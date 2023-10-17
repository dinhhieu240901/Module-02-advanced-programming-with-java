package com.codegym.thuchanh.MyLinkedList;

import java.util.LinkedList;

public class MyLinkedListTest {

  public static void main(String[] args) {
    //thực thi
    MyLinkedList<Integer> list = new MyLinkedList<Integer>(1);

    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.printList();
    System.out.println("list is get 3 elements");
      System.out.println(list.get(1).data);
      System.out.println(list.get(3).data);

  }
}
