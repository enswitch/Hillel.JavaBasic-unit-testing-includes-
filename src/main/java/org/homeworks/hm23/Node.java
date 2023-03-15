package org.homeworks.hm23;

public class Node {
    int key;
    int value;
    Node left, right;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        left = right = null;
    }
}
