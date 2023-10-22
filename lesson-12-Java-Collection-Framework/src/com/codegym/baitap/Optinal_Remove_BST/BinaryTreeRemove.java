package com.codegym.baitap.Optinal_Remove_BST;


public class BinaryTreeRemove<E extends Comparable<E>> {

    private TreeNode<E> root;
    private int size;

    public BinaryTreeRemove() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
        } else {
            root = insert(root, e);
        }
        size++;
        return true;
    }

    private TreeNode<E> insert(TreeNode<E> root, E e) {
        if (root == null) {
            return new TreeNode<>(e);
        }

        if (e.compareTo(root.element) < 0) {
            root.left = insert(root.left, e);
        } else if (e.compareTo(root.element) > 0) {
            root.right = insert(root.right, e);
        }

        return root;
    }

    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current != null) {
            int compare = e.compareTo(current.element);
            if (compare == 0) {
                break;
            }
            parent = current;
            if (compare < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.left == null) {
            replaceNode(parent, current, current.right);
        } else if (current.right == null) {
            replaceNode(parent, current, current.left);
        } else {
            TreeNode<E> min = findMin(current.right);
            current.element = min.element;
            deleteMin(current, current.right);
        }

        size--;
        return true;
    }

    private void replaceNode(TreeNode<E> parent, TreeNode<E> current, TreeNode<E> newNode) {
        if (parent == null) {
            root = newNode;
        } else if (current == parent.left) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    private TreeNode<E> findMin(TreeNode<E> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private void deleteMin(TreeNode<E> parent, TreeNode<E> node) {
        while (node.left != null) {
            parent = node;
            node = node.left;
        }
        replaceNode(parent, node, node.right);
    }

    private TreeNodeWithParent<E> findMax(TreeNode<E> node, TreeNode<E> parent) {
        while (node.right != null) {
            parent = node;
            node = node.right;
        }
        return new TreeNodeWithParent<>(node, parent);
    }

    private TreeNodeWithParent<E> find(TreeNode<E> node, TreeNode<E> parent, E e) {
        if (node == null) {
            return new TreeNodeWithParent<>(null, parent);
        }

        if (e.compareTo(node.element) < 0) {
            return find(node.left, node, e);
        } else if (e.compareTo(node.element) > 0) {
            return find(node.right, node, e);
        } else {
            return new TreeNodeWithParent<>(node, parent);
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode<E> node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.element + " ");
            inorder(node.right);
        }
    }

    private static class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E element) {
            this.element = element;
        }
    }

    private static class TreeNodeWithParent<E> {
        TreeNode<E> node;
        TreeNode<E> parent;

        public TreeNodeWithParent(TreeNode<E> node, TreeNode<E> parent) {
            this.node = node;
            this.parent = parent;
        }
    }
}
