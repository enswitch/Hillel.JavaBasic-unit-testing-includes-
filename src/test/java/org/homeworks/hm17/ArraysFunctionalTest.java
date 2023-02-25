package org.homeworks.hm17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysFunctionalTest {

    ArraysFunctional arr = new ArraysFunctional();
    int newArr[] = {5, 8, -3, 6, 13, 54, -22, 0, 3, -5, 10};
    int emptyArr[] = {};
    int matrix1[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

    int matrix2[][] = {{1, 2, 3},
                       {4, 5},
                       {6}};

    @Test
    void arrayAverageValue() {
        Assertions.assertEquals(6.27, arr.arraysAverageValue(newArr));
    }

    @Test
    void emptyArrayAverageValue() {
        Assertions.assertEquals(0.0, arr.arraysAverageValue(emptyArr));
    }

    @Test
    void AverageValueIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> arr.arraysAverageValue(null));
    }

    @Test
    void isMatrixSquare() {
        Assertions.assertEquals(true, arr.isMatrixSquare(matrix1));
    }

    @Test
    void isMatrixNotSquare() {
        Assertions.assertEquals(false, arr.isMatrixSquare(matrix2));
    }

    @Test
    void isMatrixSquareIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> arr.isMatrixSquare(null));
    }
}
