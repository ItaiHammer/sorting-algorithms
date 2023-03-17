package SortingAlgorithms;

import Interfaces.SortingAlgorithm;

public class BinarySearch implements SortingAlgorithm {
    public int[] sort (int[] arr) {
        

        return arr;
    }

    public int indexOf(int target, int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (right != left) {
            int mid = (left + right)/2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] > target) {
                left = mid + 1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

    public int indexOfRecursive(int target, int[] arr, int left, int right) {
        if (right == left) return -1;
        int mid = (left + right)/2;

        if (arr[mid] == target) {
            return mid;
        }else if (arr[mid] > target) {
            left = mid + 1;
        }else {
            right = mid-1;
        }

        return indexOfRecursive(target, arr, left, right);
    }
    
}
