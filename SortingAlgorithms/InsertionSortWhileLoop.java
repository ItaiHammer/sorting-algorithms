package SortingAlgorithms;

import Interfaces.SortingAlgorithm;

public class InsertionSortWhileLoop implements SortingAlgorithm {
    public int[] sort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valToInsert = arr[i];
            int correctLoc = i - 1;

            while( correctLoc != -1 && valToInsert < arr[correctLoc] ) {
                swap(arr, i, correctLoc);
                correctLoc--;
            }
            
            arr[correctLoc + 1] = valToInsert;
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
