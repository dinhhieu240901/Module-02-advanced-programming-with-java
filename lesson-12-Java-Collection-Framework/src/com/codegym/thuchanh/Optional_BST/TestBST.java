package com.codegym.thuchanh.Optional_BST;

public class TestBST {

  public static void main(String[] args) {
    BST<Integer> bst = new BST<Integer>();
    bst.insert(1);
    bst.insert(2);
    bst.insert(3);
    bst.insert(4);
    bst.get1(5);

//    System.out.println("Inorder sorted: ");
    bst.inorder();
    bst.postorder();
    System.out.println("The number of nodes is: " + bst.getsize());
    bst.get("4");
  }
}
