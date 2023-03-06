package SortingAlgorithms;

import Interfaces.SortingAlgorithm;

public class ItaiSorting implements SortingAlgorithm {
    public int[] sort (int[] arr) {
        return loopSort(arr, 0, arr.length-1);
    }

    private int[] loopSort(int[] arr, int low, int high) {
        if (low < high) {
            if (arr[low] > arr[high]) {
                swap(arr, low, high);
            }
    
            int pivot1 = arr[low];
            int pivot2 = arr[high];
    
            int i = low + 1;
            int li = low + 1;
            int hi = high - 1;
    
            while (i <= hi) {
                if (arr[i] < pivot1) {
                    swap(arr, i, li);
                    li++;
                    i++;
                } else if (arr[i] > pivot2) {
                    swap(arr, i, hi);
                    hi--;
                } else {
                    i++;
                }
            }
    
            swap(arr, low, li - 1);
            swap(arr, hi + 1, high);
    
            loopSort(arr, low, li - 2);
            loopSort(arr, li, hi);
            loopSort(arr, hi + 2, high);

        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
