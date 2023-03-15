package org.homeworks.hm22;

public class ArrayListDemo {

    public static void main(String[] args) {
        MyArrayList example = new MyArrayList(); // default capacity 8
        example.printAll();


        MyArrayList list = new MyArrayList(1); // new capacity 1

        list.add("new");
        list.remove();

        list.addLast("new");
        list.remove(0);

        list.add("third", 0);
        list.add("first");
        list.add("second", 1);
        list.addLast("fourth");

        System.out.println(list.size());
        System.out.println(list.get(1));
        list.printAll();

        list.remove(2);
        list.remove();
        list.removeLast();
        list.printAll();

        MyArrayList newList = new MyArrayList(1);
        newList.add("test");

        newList.printAll();
        newList.remove(0);
        newList.printAll();

    }
}
