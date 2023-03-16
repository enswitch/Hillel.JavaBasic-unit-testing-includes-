package org.homeworks.hm23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    @Test
    void addAndSearchTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(5);
        tree.add(7);
        tree.add(6);

        Assertions.assertTrue(tree.search(5));
        Assertions.assertTrue(tree.search(6));
        Assertions.assertTrue(tree.search(7));
        Assertions.assertFalse(tree.search(8));
    }

    @Test
    void removeAndSearchTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.add(5);
        tree.add(7);
        tree.add(6);

        tree.remove(5);
        tree.remove(6);

        Assertions.assertFalse(tree.search(5));
        Assertions.assertFalse(tree.search(6));
        Assertions.assertTrue(tree.search(7));
    }
}
