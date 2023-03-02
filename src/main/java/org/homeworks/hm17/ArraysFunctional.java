package org.homeworks.hm17;

public class ArraysFunctional {

    public double arraysAverageValue(int arr[]) {
        if (arr == null) {
            throw new IllegalArgumentException("Unvalid data type!");
        }
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
        if (arr == null) {
            throw new IllegalArgumentException("Unvalid data type!");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalArgumentException("Unvalid data type!");
            }
            if (arr.length != arr[i].length) {
                isSquare = false;
            }
            if (arr.length == 0 || arr[i].length == 0) {
                isSquare = false;
            }
        }
        return isSquare;
    }
}
