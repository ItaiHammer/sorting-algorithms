package SortingAlgorithms;

import Interfaces.SortingAlgorithm;

public class SequentialSearch implements SortingAlgorithm {
    public static int[] sort (int[] arr) {


        return arr;
    }

    public int indexOf(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    
}
