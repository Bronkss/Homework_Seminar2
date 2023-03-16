package org.example.hm3;

public class Task3 {
    public static void main(String[] args) {
        int[] array = replacingNegativeElements(new int[] { 1, 2, 3, 4, -56, 1, 32, 36, -34, -66, 2 });
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

    public static int[] replacingNegativeElements(int[] array) {
        int[] newArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] < 100) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[i] = sum;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
