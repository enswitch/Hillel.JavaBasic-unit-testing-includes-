package org.homeworks.hm23;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(4);
        tree.add(3);
        tree.add(5);
        tree.add(8);
        tree.add(2);
        tree.add(1);
        tree.add(7);

        System.out.println(tree.search(9)); //not exist
        System.out.println(tree.search(4));
        System.out.println(tree.search(7));
        System.out.println(tree.search(8) + "\n");


        tree.remove(7);
        tree.remove(4);
        tree.remove(8);


        System.out.println(tree.search(7));
        System.out.println(tree.search(4));
        System.out.println(tree.search(8));
    }
}
