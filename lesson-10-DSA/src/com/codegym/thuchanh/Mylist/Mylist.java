package com.codegym.thuchanh.Mylist;

public class Mylist<E> {

  private int size;
  private final int DEFAULT_CAPACITY = 10;
  private Object[] elements;

  public Mylist() {
    size = 0;
    elements = new Object[DEFAULT_CAPACITY];
  }

  public void add(int index, E element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    ensureCapacity();
    for (int i = size - 1; i >= index; i--) {
      elements[i + 1] = elements[i];
    }

    elements[index] = element;
    size++;
  }
  public void add(E element) {
    ensureCapacity();
    System.arraycopy(elements, size, elements, size + 1, size);
    // for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
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

  //Phương thức truy cập một phần tử trong danh sách: get()
  //  @Override
  public E get(int index) {
    if (index >= 0 && index < size) {
      return (E) elements[index];
    } else {
      throw new IndexOutOfBoundsException("Index is out of bounds");
    }
  }
  public void showList() {
    System.out.print("Danh sách các phần tử: ");
    for (Object element : elements) {
      if (element != null) {
        System.out.print(element + " ");
      }
    }
    System.out.println();
  }

}
