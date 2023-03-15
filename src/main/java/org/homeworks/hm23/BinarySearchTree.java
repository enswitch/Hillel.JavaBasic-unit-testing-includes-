package org.homeworks.hm23;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key, int value) {
        root = insertRecursive(root, key, value);
    }

    Node insertRecursive(Node root, int key, int value) {
        if (root == null) {
            root = new Node(key, value);
            return root;
        }
        if (key < root.key) {
            root.left = insertRecursive(root.left, key, value);
        } else if (key > root.key) {
            root.right = insertRecursive(root.right, key, value);
        }
        return root;
    }

    void inorder() {
        inorderRecursive(root);
    }

    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print("(key " + root.key + ": " + root.value + ") ");
            inorderRecursive(root.right);
        }
    }


    Node search(int key) {
        return searchRecursive(root, key);
    }

    Node searchRecursive(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }
        if (key < root.key) {
            return searchRecursive(root.left, key);
        }
        return searchRecursive(root.right, key);
    }


    void delete(int key) {
        root = deleteRecursive(root, key);
    }


    Node deleteRecursive(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = deleteRecursive(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRecursive(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node minNode = minValueNode(root.right);
            root.key = minNode.key;
            root.value = minNode.value;
            root.right = deleteRecursive(root.right, minNode.key);
        }
        return root;
    }

    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
}
