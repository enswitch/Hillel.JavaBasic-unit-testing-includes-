package org.homeworks.hm22;

import java.util.Arrays;

public class MyArrayList implements MyList {

    private static final int CAPACITY_DEFAULT = 8;
    private String[] elements = new String[CAPACITY_DEFAULT];
    private int size;

    public MyArrayList() {

    }

    public MyArrayList(int changeCapacity) {
        if (changeCapacity <= 0) {
            throw new IllegalArgumentException("Invalid array list length!");
        }
        elements = new String[changeCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    public void resizeArrayIfNeed() {
        if (elements.length == size) {
            String[] newArray = new String[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
    }

    @Override
    public void add(String value) { //addFirst
        add(value, 0);
    }

    @Override
    public void add(String value, int index) {
        checkIndex(index);
        resizeArrayIfNeed();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;
    }

    @Override
    public void addLast(String value) {
        add(value, size);
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return elements[index];
    }

    @Override
    public String remove(int index) {
        checkIndex(index);
        String removedElem = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return removedElem;
    }

    @Override
    public String removeLast() {
        String removedElem = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return removedElem;
    }

    @Override
    public String remove() { //remove first
        if (size == 0) {
            throw new IllegalStateException("Cannot remove from an empty list");
        }
        String removedElem = elements[0];
        System.arraycopy(elements, 1, elements, 0, size - 1);
        elements[--size] = null;
        return removedElem;
    }

    @Override
    public void printAll() {
        System.out.println(Arrays.toString(elements));
    }
}
