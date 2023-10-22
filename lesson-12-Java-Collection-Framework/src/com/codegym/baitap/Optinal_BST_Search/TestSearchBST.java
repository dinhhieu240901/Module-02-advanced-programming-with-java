package com.codegym.baitap.Optinal_BST_Search;

public class TestSearchBST {
    public static void main(String[] args) {
        BinaryTreeSearch<Integer> tree = new BinaryTreeSearch<>();

        // Insert elements
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);

        System.out.println("Search for 60: " + tree.search(60));
        System.out.println("Search for 57: " + tree.search(57));
        System.out.println("Search for 50: " + tree.search(50));
        
    }
}
