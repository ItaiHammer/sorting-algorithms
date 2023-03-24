import java.util.ArrayList;
import java.util.Arrays;

import Classes.Circle;
import Interfaces.SortingAlgorithm;
import SortingAlgorithms.*;
import InProgress.*;

/**
 * Sorts
 */
public class Testing {

    public static void main(String[] args) {
        int[] test1 = {5, 2, 5, 5, 3, 3, 3, 2, 2, 2, 6, 3, 3, 5};
        int[] test2 = {7, 3, 4, 2, 6, 9, 1, 2};
        int[] test3 = {9, 8, 7, 6, 5, 4, 3, 2};
        int[] test4 = {3};
        int[] test5 = {};
        int[] test6 = {3, 2, 1, 4, 5};

        BetterMergeSort m = new BetterMergeSort();
        int[] s = m.sort(test6);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+", ");
        }
        
        

        // ArrayList<int[]> tests = new ArrayList<>();
        // tests.add(test1);
        // tests.add(test2);
        // tests.add(test3);
        // tests.add(test4);
        // tests.add(test5);

        // for( int i = 0; i < tests.size(); i++) {
        //     int[] test = tests.get(i);
        //     System.out.println("===== Test #" + i + "=========");
        //     System.out.println("Before: " + Arrays.toString(test));
            
            

        //     System.out.println("After: " + Arrays.toString(test));
        //     System.out.println("================================");
        // }

        // System.out.println("Circles before:");
        // for (int i = 0; i < randomized.length; i++) {
        //     System.out.print(randomized[i]+", ");
        // }

        // new SelectionObj().sort(randomized);

        // System.out.println();
        // System.out.println("Circles After:");
        // for (int i = 0; i < randomized.length; i++) {
        //     System.out.print(randomized[i]+", ");
        // }

        // int[] arr = {1, 2, 3, 4, 5};
        // System.out.println();
        // System.out.println(groupSum(0, arr, 16));
    }

    public static String insertStars (String s) {
        if (s.length() == 2) {
            return s.substring(0, 1) + "*" + s.substring(1);
        }else if (s.length() <= 1) {
            return s;
        }

        return s.substring(0, 1) + "*" + insertStars(s.substring(1));
    }

    private static boolean groupSum (int s, int[] arr, int t) {
        // base case
        if (t == 0) {
            return true;
        }

        // end of array
        if (s >= arr.length) {
            return false;
        }

        // with current number
        if (groupSum(s+1, arr, t - arr[s])) {
            return true;
        }

        // without current number
        if (groupSum(s+1, arr, t)) {
            return true;
        }

        // exit
        return false;
    }
}