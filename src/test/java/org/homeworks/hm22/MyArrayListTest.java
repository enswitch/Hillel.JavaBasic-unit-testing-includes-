package org.homeworks.hm22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyArrayListTest {


    @Test
    void getInvalidIndexElement() {
        MyArrayList list = new MyArrayList();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    void addFirstAndGetTest() {
        MyArrayList list = new MyArrayList();

        list.add("third");
        list.add("second");
        list.add("first");
        Assertions.assertEquals("first", list.get(0));
    }

    @Test
    void addLastAndGetTest() {
        MyArrayList list = new MyArrayList();
        list.addLast("third");
        list.addLast("second");
        list.addLast("first");
        Assertions.assertEquals("first", list.get(2));
    }

    @Test
    void addByIndexAndGetTest() {
        MyArrayList list = new MyArrayList();
        list.add("third", 0);
        list.add("second", 0);
        list.add("first", 1);
        Assertions.assertEquals("first", list.get(1));
    }

    @Test
    void addByInvalidIndexTest() {
        MyArrayList list = new MyArrayList();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.add("first", 1));
    }

    @Test
    void removeEmptyArrayTest() {
        MyArrayList list = new MyArrayList();

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove());
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.removeLast());
    }

    @Test
    void removeFirstTest() {
        MyArrayList list = new MyArrayList();

        list.add("first");
        Assertions.assertEquals("first", list.remove());
    }

    @Test
    void removeLastTest() {
        MyArrayList list = new MyArrayList();

        list.add("first");
        list.addLast("third");
        list.add("second", 1);
        Assertions.assertEquals("third", list.removeLast());
    }

    @Test
    void removeByIndexTest() {
        MyArrayList list = new MyArrayList();

        list.add("test");
        Assertions.assertEquals("test", list.remove(0));
    }

    @Test
    void removeByInvalidIndex() {
        MyArrayList list = new MyArrayList();

        list.add("test");
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void sizeTest() {
        MyArrayList list = new MyArrayList();
        list.add("test", 0);
        list.add("test", 1);
        list.add("test", 2);
        list.add("test", 1);
        list.add("test", 0);

        list.remove(3);
        list.remove();
        list.removeLast();

        Assertions.assertEquals(2, list.size());
    }
}
