package com.codegym.baitap.Optinal_BST_PreOrder;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();
    public void postorder();
    public void preorder();

    public int getsize();
}
