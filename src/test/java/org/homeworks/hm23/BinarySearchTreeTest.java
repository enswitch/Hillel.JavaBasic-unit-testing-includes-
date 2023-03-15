package org.homeworks.hm23;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BinarySearchTreeTest {

    @Test
    void testInsertAndSearch() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5, 1);
        tree.insert(3, 2);
        tree.insert(2, 3);
        tree.insert(4, 4);
        tree.insert(7, 5);
        tree.insert(6, 6);
        tree.insert(8, 7);

        Node searchResult = tree.search(6);
        Assertions.assertEquals(searchResult.value, 6);

        searchResult = tree.search(9);
        Assertions.assertNull(searchResult);
    }

    @Test
    void testDelete() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(5, 1);
        tree.insert(3, 2);
        tree.insert(2, 3);
        tree.insert(4, 4);
        tree.insert(7, 5);
        tree.insert(6, 6);
        tree.insert(8, 7);

        tree.delete(2);

        Node searchResult = tree.search(2);
        Assertions.assertNull(searchResult);

        tree.delete(3);

        searchResult = tree.search(3);
        Assertions.assertNull(searchResult);

        searchResult = tree.search(4);
        Assertions.assertEquals(searchResult.value, 4);
    }
}
