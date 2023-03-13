package org.homeworks.hm22;

public class ArrayListDemo {

    public static void main(String[] args) {
        MyArrayList example = new MyArrayList(); // default capacity 8
        example.printAll();

        MyArrayList list = new MyArrayList(3); // new capacity 3
        list.printAll();

        list.add("third");
        list.add("second");
        list.add("first");
        list.addLast("fourth");
        list.add("new", 2);
        list.printAll();

        list.remove();
        list.remove(1);
        list.removeLast();
        list.printAll();

        System.out.println(list.get(1));
        System.out.println(list.size());


    }
}
