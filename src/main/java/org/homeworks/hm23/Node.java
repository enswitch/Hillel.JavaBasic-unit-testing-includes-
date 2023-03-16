package org.homeworks.hm23;

public class Node {
    String value;
    int key;
    Node left;
    Node right;

    public Node(String value, int key) {
        this.value = value;
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

