package com.codegym.baitap.Optinal_BST_Search;

public class BinaryTreeSearch<E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size;
    private static class TreeNode<E> {
        E element;
        BinaryTreeSearch.TreeNode<E> left;
        BinaryTreeSearch.TreeNode<E> right;

        public TreeNode(E element) {
            this.element     = element;
        }
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public BinaryTreeSearch() {
        root = null;
        size = 0;
    }
    public boolean insert(E e) {
        if (root == null) {
            root = new BinaryTreeSearch.TreeNode<>(e);
        } else {
            root = insert(root, e);
        }
        size++;
        return true;
    }

    private BinaryTreeSearch.TreeNode<E> insert(BinaryTreeSearch.TreeNode<E> root, E e) {
        if (root == null) {
            return new BinaryTreeSearch.TreeNode<>(e);
        }

        if (e.compareTo(root.element) < 0) {
            root.left = insert(root.left, e);
        } else if (e.compareTo(root.element) > 0) {
            root.right = insert(root.right, e);
        }

        return root;
    }
    public boolean search(E e){
        return search(root, e);
    }
    public boolean search(TreeNode<E> root , E e){
        if(root == null){
            return false ;
        }
        if(root.element.compareTo(e) == 0) return true;
        if(e.compareTo(root.element) < 0) {
            return search(root.left, e);
        } else {
            return search(root.right, e);
        }
    }

}
