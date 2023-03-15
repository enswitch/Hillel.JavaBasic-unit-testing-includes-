package org.homeworks.hm23;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BinarySearchTreeTest {

    @Test
    void testInsertAndSearch() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1, 7);
        tree.insert(2, 4);
        tree.insert(3, 2);

        Node searchResult1 = tree.search(1);
        Assertions.assertEquals(7, searchResult1.value);
    }

    @Test
    void testDelete() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1, 7);
        tree.insert(2, 4);
        tree.insert(3, 2);

        tree.delete(2);

        Node searchResult = tree.search(2);
        Assertions.assertNull(searchResult);
    }
}
