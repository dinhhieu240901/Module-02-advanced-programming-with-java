package com.codegym.thuchanh.deployment_stack;

import java.util.ArrayList;

public class MyGenericStack2<E> {

  ArrayList<E> stack = new ArrayList<>();

  public void push(E element) {
    stack.add(element);
  }

  public E pop() {
    return stack.remove(stack.size() - 1);
  }

  public int size() {
    return stack.size();
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  @Override
  public String toString() {
    return "MyGenericStack2{" + "stack=" + stack.toString() + '}';
  }
}
