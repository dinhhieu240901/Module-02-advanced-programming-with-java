package com.codegym.baitap.Optinal_BST_PreOrder;

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
    if (root != null) {
      inorder(root.left);
      System.out.print(root.element + " ");
      inorder(root.right);
    }
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

  @Override
  public void preorder() {
    preorder(root);
  }

  private void preorder(TreeNode<E> root) {
    if (root == null) {
      return;
    }
    System.out.println(root.element + " ");
    preorder(root.left);
    preorder(root.right);
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

  private TreeNodeWithParent<E> findMax(TreeNode<E> node,TreeNode<E> parent) {
    while (node.right != null) {
      parent = node;
      node = node.right;
    }
    return new TreeNodeWithParent<>(node, parent);
  }

  private TreeNodeWithParent<E> find(TreeNode<E> node,TreeNode<E> parent, E e) {
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


  private static class TreeNodeWithParent<E> {
    TreeNode<E> node;
    TreeNode<E> parent;

    public TreeNodeWithParent(TreeNode<E> node, TreeNode<E> parent) {
      this.node = node;
      this.parent = parent;
    }
  }
}
