package com.javagda25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pesymistyczna = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] optymistyczna = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//        BubbleSort.bubbleSort(optymistyczna);
//        InsertionSort.insertionSort(optymistyczna);
//        InsertionSort.insertionSort(pesymistyczna);
//        CountingSort.countingSort(pesymistyczna, 10);
        MergeSort.mergeSort(optymistyczna);

//        System.out.println(Arrays.toString(pesymistyczna));
        System.out.println(Arrays.toString(optymistyczna));
    }
}
