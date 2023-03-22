package SortingAlgorithms;

import Interfaces.SortingAlgorithm;

public class BetterMergeSort implements SortingAlgorithm {
    public int[] sort (int[] arr) {
        int[] temp = new int[arr.length];
        
        return mergeSort(arr, temp, 0, arr.length-1);
    }

    private int[] mergeSort (int[] arr, int[] temp, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return arr;
        }

        int mid = average(startIndex, endIndex);

        mergeSort(arr, temp, startIndex, mid);
        mergeSort(arr, temp, mid+1, endIndex);
        merge(arr, temp, startIndex, mid, mid+1, endIndex);

        return arr;
    }

    private void merge (int[] arr, int[] temp, int s1, int e1, int s2, int e2) {
        int leftIndex = s1;
        int rightIndex = s2;
        int nextLoc = s1;

        while (leftIndex <= e1 || rightIndex <= e2) {
            if (arr[leftIndex] < arr[rightIndex] || rightIndex >= e2) {
                temp[nextLoc] = arr[leftIndex];
                leftIndex++;
            } else if (leftIndex >= e1) {
                temp[nextLoc] = arr[rightIndex];
                rightIndex++;
            }
            System.out.println(nextLoc);
            System.out.println("LeftIndex: "+leftIndex+", e1: "+e1);
            System.out.println("RightIndex: "+rightIndex+", e2: "+e2);
            nextLoc++;
        }

        // if (leftIndex <= e1) {
        //     for (int i = leftIndex; i <= e1; i++) {
        //         temp[nextLoc] = arr[i];
        //         nextLoc++;
        //     }
        // }
        // if (rightIndex <= e2) {
        //     for (int i = rightIndex; i <= e2; i++) {
        //         temp[nextLoc] = arr[i];
        //         nextLoc++;
        //     }
        // }

        for (int i = s1; i <= e2; i++) {
            arr[i] = temp[i];
        }
    }

    private int average (int a, int b) {
        return (a + b)/2;
    }
}
