package org.homeworks.LinkedList;

public class LinkedList {

    private Node head;
    private int size;


    public void add(String value) {
        Node node = new Node(value);
        node.next = head;

        size++;
        head = node;
    }

    public void add(String value, int index) {
        if (index == 0 && size == 0) {
            add(value);
            return;
        } else if(index == size) {
            addLast(value);
            return;
        }

        validateIndex(index);

        Node previous = head;
        for (int i = 1; i < index; i++) {
            previous = previous.next;
        }

        Node newElement = new Node(value);
        newElement.next = previous.next;
        previous.next = newElement;
        size++;
    }

    private void addLast(String value) {
        if (size == 0) {
            add(value);
            return;
        }

        Node current = head;
        for (int i = 1; i < size; i++) {
            current = current.next;
        }

        current.next = new Node(value);
        size++;
    }

    public String get(int index) {
        validateIndex(index);

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return size;
    }

    public void printAll() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.print("]");
    }


    private static class Node {
        String value;
        Node next;

        private Node(String value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("third");
        list.add("second");
        list.add("first");
        list.addLast("fifth");
        list.add("fourth", 3);

        list.printAll();

        list.size();

    }
}
