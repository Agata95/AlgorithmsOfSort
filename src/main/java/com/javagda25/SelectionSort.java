package com.javagda25;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 17, 9, 0};

        selectionSort(array);
    }

    static int[] selectionSort(int[] array) {
        int minimum;
        int currentMinimum = 0;
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            minimum = array[i];
            for (int j = 1; j < array.length; j++) {
                if (array[j] < minimum) {
                    minimum = array[j]; // tutaj przypisuje juz minimum i zanika wartosc array[j] - trzeba zmienic
                    currentMinimum = array[j];
                }
                number = j;
            }
            array[number] = array[i];
            array[i] = currentMinimum;

        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }
}
