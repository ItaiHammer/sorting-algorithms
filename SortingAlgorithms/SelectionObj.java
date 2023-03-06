package SortingAlgorithms;

import Classes.Circle;
import Interfaces.SortingAlgorithm;

public class SelectionObj implements SortingAlgorithm {
    public Circle[] sort (Circle[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            Circle temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
