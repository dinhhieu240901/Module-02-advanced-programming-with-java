package com.codegym.baitap.Optinal_Remove_BST;

public class TestRemoveBST {
    public static void main(String[] args) {
        BinaryTreeRemove<Integer> tree = new BinaryTreeRemove<>();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        System.out.println("Cây tìm kiếm nhị phân gốc:");
        tree.inorder();
        int elementToDelete = 30;
        if (tree.delete(elementToDelete)) {
            System.out.println("Xóa phần tử " + elementToDelete + " thành công.");
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToDelete + " để xóa.");
        }
        System.out.println("Cây sau khi xóa " + elementToDelete + ":");
        tree.inorder();
    }
}
