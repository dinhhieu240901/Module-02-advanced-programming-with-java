package com.codegym.baitap.Optinal_BST_PostOrder;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {

  protected TreeNode<E> root;
  protected int size;

  public BST() {}

  public BST(E[] objects) {
    for (E object : objects) insert(object);
  }

  @Override
  public boolean insert(E e) {
    if (root == null) {
      root = createNewNode(e);
    } else {
      TreeNode<E> parrent = null;
      TreeNode<E> current = root;
      while (current != null) {
        parrent = current;
        if (e.compareTo(current.element) < 0) {
          current = current.left;
        } else if (e.compareTo(current.element) > 0) {
          current = current.right;
        } else {
          return false;
        }
      }
      if (e.compareTo(parrent.element) < 0) {
        parrent.left = createNewNode(e);
      } else {
        parrent.right = createNewNode(e);
      }
    }
    size++;
    return true;
  }

  private TreeNode<E> createNewNode(E e) {
    return new TreeNode<E>(e);
  }

  @Override
  public int getsize() {
    return size;
  }

  @Override
  public void inorder() {
    inorder(root);
  }

  private void inorder(TreeNode<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.println(root.element + " ");
    inorder(root.right);
  }

    @Override
    public void postorder() {
        postorder(root);
    }

    //sort with postorder
  public void postorder(TreeNode<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.element + " ");
  }

  public void get(String key) {
    if (root == null) {
      System.out.println(key + " not found");
      return;
    }
    TreeNode<E> current = root;
    while (current != null) {
      if (key.compareTo(current.element.toString()) < 0) {
        current = current.left;
      } else if (key.compareTo(current.element.toString()) > 0) {
        current = current.right;
      } else {
        System.out.println(key + " found");
        return;
      }
    }
    System.out.println(key + " not found");
  }

  public void get1(E s) {
    TreeNode<E> goc = root;
    TreeNode<E> parent = null;

    while (goc != null) {
      parent = goc;
      if (s.compareTo(goc.element) < 0) {
        goc = goc.left;
      } else if (s.compareTo(goc.element) > 0) {
        goc = goc.right;
      }
    }
    if (parent == null) {
      root = new TreeNode<>(s);
    } else if (s.compareTo(parent.element) < 0) {
      parent.left = new TreeNode<>(s);
    } else {
      parent.right = new TreeNode<>(s);
    }
  }
}
