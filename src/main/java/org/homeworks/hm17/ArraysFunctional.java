package org.homeworks.hm17;

public class ArraysFunctional {

    public double arraysAverageValue(int arr[]) {
        if (arr == null) {
            throw new IllegalArgumentException("Unvalid data type!");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double result = (double) sum / arr.length;
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }


    public boolean isMatrixSquare(int arr[][]) {
        boolean isSquare = true;
        if (arr == null) {
            throw new IllegalArgumentException("Unvalid data type!");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalStateException("Unvalid state!");
            }
            if (arr.length != arr[i].length) {
                isSquare = false;
            }
        }
        return isSquare;
    }
}
