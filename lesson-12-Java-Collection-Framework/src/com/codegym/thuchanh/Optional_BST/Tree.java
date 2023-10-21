package com.codegym.thuchanh.Optional_BST;

public interface Tree<E> {
  public boolean insert(E e);

  public void inorder();

  public int getsize();
}
