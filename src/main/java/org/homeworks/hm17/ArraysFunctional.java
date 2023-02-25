package org.homeworks.hm17;

public class ArraysFunctional {

    public double arraysAverageCount(int arr[]) {
        double result = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result = (double) sum / arr.length;
        }
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }

    public boolean isMatrixSquare(int arr[][]) {
        boolean isSquare = true;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
                if (arr.length != arr[row].length)
                    isSquare = false;
        }
        return isSquare;
    }
}
