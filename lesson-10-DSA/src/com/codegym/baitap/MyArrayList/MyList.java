package com.codegym.baitap.MyArrayList;

import com.codegym.thuchanh.Mylist.Mylist;

public class MyList<E> {

  int size = 0;
  static final int DEFAULT_CAPACITY = 10;
  private Object[] elements;

  public MyList() {
    size = 0;
    elements = new Object[DEFAULT_CAPACITY];
  }

  public MyList(int capacity) {
    elements = new Object[capacity];
  }

  void add(int index, E element) {
    if (index > 0 || index <= size) {
      ensureCapacity();
      for (int i = size - 1; i >= index; i--) {
        elements[i + 1] = elements[i];
      }
      elements[index] = element;
      size++;
    } else {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
  }

  public void add(E element) {
    ensureCapacity();
    System.arraycopy(elements, size, elements, size + 1, size);
    elements[size] = element;
    size++;
  }

  public void ensureCapacity() {
    if (size >= elements.length) {
      Object[] newElements = new Object[elements.length * 2];
      System.arraycopy(elements, 0, newElements, 0, elements.length);
      elements = newElements;
    }
  }

  public boolean contain(E o) {
    for (int i = 0; i < size; i++) {
      if (elements[i].equals(o)) {
        return true;
      }
    }
    return false;
  }

  public E remove(int index) {
    if (index >= 0 && index < size) {
      E element = (E) elements[index];
      for (int i = index; i < size; i++) {
        elements[i] = elements[i + 1];
      }
      size--;
      return element;
    } else {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
  }

  public int size() {
    return size;
  }

  public int indexOf(E o) {
    for (int i = 0; i < size; i++) {
      if (elements[i].equals(o)) {
        return i;
      }
    }
    return -1;
  }

  public boolean add(E e, int index) {
    if (index >= 0 && index <= size) {
      size += 1;
      ensureCapacity();
      for (int i = size - 2; i >= index; i--) {
        elements[i + 1] = elements[i];
      }
      elements[index] = e;
      return true;
    }
    return false;
  }

  public E get(int index) {
    if (index >= 0 && index < size) {
      return (E) elements[index];
    }
    return null;
  }

  public void clear() {
    size = 0;
  }

  public Object[] getData() {
    return this.elements;
  }

  public void showList() {
    System.out.print("Danh sách sinh viên: ");
    for (Object element : elements) {
      if (element != null) {
        System.out.print(element + " ");
      }
    }
    System.out.println();
  }
}
