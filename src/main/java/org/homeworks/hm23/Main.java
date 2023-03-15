package org.homeworks.hm23;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5, 1);
        tree.insert(3, 2);
        tree.insert(2, 3);
        tree.insert(4, 4);
        tree.insert(7, 5);
        tree.insert(6, 6);
        tree.insert(8, 7);

        System.out.println("Created binary tree:");
        tree.inorder();


        Node searchResult = tree.search(7);
        if (searchResult != null) {
            System.out.println("\n\nFound value " + searchResult.value);
        } else {
            System.out.println("\n\nValue for key not found");
        }


        tree.delete(7);
        System.out.println("Inorder the modified tree:");
        tree.inorder();

    }
}
