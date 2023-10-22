package com.codegym.baitap.Optinal_BST_PostOrder;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();
    public void postorder();

    public int getsize();
}
