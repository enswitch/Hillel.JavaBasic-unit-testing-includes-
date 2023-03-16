package org.homeworks.hm23;

public class BinarySearchTree {

    private class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    Node root;


    private Node add(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (node.key > key) {
            node.left = add(node.left, key);
        } else if (node.key < key) {
            node.right = add(node.right, key);
        }
        return node;
    }


    public void add(int key) {
        root = add(root, key);
    }


    private Node minFind(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


    private Node remove(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (node.key > key) {
            node.left = remove(node.left, key);
        } else if (node.key < key) {
            node.right = remove(node.right, key);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node minNode = minFind(node.right);
                node.key = minNode.key;
                node.right = remove(node.right, minNode.key);
            }
        }
        return node;
    }


    public void remove(int key) {
        root = remove(root, key);
    }


    private boolean search(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.key == key) {
            return true;
        } else if (node.key > key) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }


    public boolean search(int key) {
        return search(root, key);
    }
}
