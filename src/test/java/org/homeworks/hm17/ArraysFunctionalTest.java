package org.homeworks.hm17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysFunctionalTest {

    ArraysFunctional arr = new ArraysFunctional();

    @Test
    void arrayAverageValue() {
        int[] newArr = {5, 8, -3, 6, 13, 54, -22, 0, 3, -5, 10};
        Assertions.assertEquals(6.27, arr.arraysAverageValue(newArr));
    }

    @Test
    void arrayEmptyAverageValue() {
        int[] emptyArr = new int[]{};
        Assertions.assertEquals(0.0, arr.arraysAverageValue(emptyArr));
    }

    @Test
    void arrayAverageValueIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> arr.arraysAverageValue(null));
    }

    @Test
    void isMatrixSquare() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        Assertions.assertTrue(arr.isMatrixSquare(matrix1));
    }

    @Test
    void isMatrixNotSquare() {
        int[][] matrix2 = {{1, 2, 3}, {}, {4, 5, 6}};
        Assertions.assertFalse(arr.isMatrixSquare(matrix2));
    }

    @Test
    void isMatrixSquareIsEmpty() {
        int[][] emptyMatrix = {{}};
        Assertions.assertFalse(arr.isMatrixSquare(emptyMatrix));
    }

    @Test
    void matrixSquareCheckForNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> arr.isMatrixSquare(null));
    }

    @Test
    void matrixSquareDeepCheckForNull() {
        int[][] deepNullMatrix = {{1, 2}, null, {3, 4}};
        Assertions.assertThrows(IllegalStateException.class, () -> arr.isMatrixSquare(deepNullMatrix));
    }
}
