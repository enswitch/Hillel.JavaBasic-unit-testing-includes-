package org.homeworks.hm22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyArrayListTest {

    @Test
    void capacityAndResizeTest() {
        MyArrayList list1 = new MyArrayList(); //8

        list1.add("new");
        list1.printAll();

        MyArrayList list2 = new MyArrayList(1); //1

        list2.add("new"); //1
        list2.printAll();

        list2.add("new"); //2
        list2.add("new"); //4
        list2.printAll();
    }

    @Test
    void checkIndexTest() {
        MyArrayList list = new MyArrayList();

        list.add("new");
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.checkIndex(2));

        list.add("new");
        list.add("new");
        list.remove();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.checkIndex(3));
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
    void removeFirstTest() {
        MyArrayList list = new MyArrayList(1);
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
        MyArrayList list = new MyArrayList(1);
        list.add("test");

        Assertions.assertEquals("test", list.remove(0));
    }

    @Test
    void removeByInvalidIndex() {
        MyArrayList list = new MyArrayList(1);
        list.add("test");

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void sizeTest() {
        MyArrayList list = new MyArrayList(1);
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
