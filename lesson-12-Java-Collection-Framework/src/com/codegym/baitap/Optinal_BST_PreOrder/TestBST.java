package com.codegym.baitap.Optinal_BST_PreOrder;


public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        // Thêm các phần tử vào cây
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // In cây dưới dạng cây tìm kiếm nhị phân
        System.out.println("Cây tìm kiếm nhị phân gốc:");
        tree.inorder();

        // Xóa một phần tử
        int elementToDelete = 30;
        if (tree.delete(elementToDelete)) {
            System.out.println("Xóa phần tử " + elementToDelete + " thành công.");
        } else {
            System.out.println("Không tìm thấy phần tử " + elementToDelete + " để xóa.");
        }

        // In cây sau khi xóa phần tử
        System.out.println("Cây sau khi xóa " + elementToDelete + ":");
        tree.inorder();
    }
}
