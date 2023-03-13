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

    public void checkIndexValue(int index) {
        if (index >= size || index <= 0) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
    }

    @Override
    public void add(String value) { //addFirst
        resizeArrayIfNeed();
        System.arraycopy(elements, 0, elements, 1, elements.length - 1);
        elements[0] = value;
        size++;
    }

    @Override
    public void add(String value, int index) {
        checkIndexValue(index);
        resizeArrayIfNeed();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;

    }

    @Override
    public void addLast(String value) {
        resizeArrayIfNeed();
        elements[size] = value;
        size++;
    }

    @Override
    public String get(int index) {
        checkIndexValue(index);
        return elements[index];
    }

    @Override
    public String remove(int index) {
        checkIndexValue(index);
        String removedElem = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index);
        size--;
        return removedElem;
    }

    @Override
    public String removeLast() {
        String removedElem = elements[size - 1];
        System.arraycopy(elements, size, elements, size - 1, size);
        size--;
        return removedElem;
    }

    @Override
    public String remove() { //remove first
        String removedElem = elements[0];
        System.arraycopy(elements, 1, elements, 0, size);
        size--;
        return removedElem;

    }

    @Override
    public void printAll() {
        System.out.println(Arrays.toString(elements));
    }
}
