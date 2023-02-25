package org.homeworks.hm17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysFunctionalTest {

    ArraysFunctional arr = new ArraysFunctional();
    int newArr[] = {5, 8, -3, 6, 13, 54, -22, 0, 3, -5, 10};
    int matrix1[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

    int matrix2[][] = {{1, 2, 3},
                       {4, 5},
                       {6}};

    @Test
    public void arrayAverageIndexTest() {
        Assertions.assertEquals(6.27, arr.arraysAverageCount(newArr));
    }

    @Test
    public void isMatrixSquareTrueTest() {
        Assertions.assertEquals(true, arr.isMatrixSquare(matrix1));
    }

    @Test
    public void isMatrixSquareFalseTest() {
        Assertions.assertEquals(false, arr.isMatrixSquare(matrix2));
    }
}
