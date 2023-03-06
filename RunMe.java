import java.util.ArrayList;
import java.util.Arrays;

import Classes.Circle;
import Interfaces.SortingAlgorithm;
import SortingAlgorithms.*;

/**
 * Sorts
 */
public class RunMe {

    public static void main(String[] args) {
        int[] test1 = {5, 2, 5, 5, 3, 3, 3, 2, 2, 2, 6, 3, 3, 5};
        int[] test2 = {7, 3, 4, 2, 6, 9, 1, 2};
        int[] test3 = {9, 8, 7, 6, 5, 4, 3, 2};
        int[] test4 = {3};
        int[] test5 = {};

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Comparable[] randomized = new Comparable[10];

        for (int i = 0; i < 10; i++) {
            String text = "";
            int length = (int)(Math.random() * 9 + 1);
            for (int j = 0; j < length; j++) {
                text += alphabet[(int)(Math.random() * randomized.length)];
            }
            randomized[i] = text;
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

        System.out.println("Circles before:");
        for (int i = 0; i < randomized.length; i++) {
            System.out.print(randomized[i]+", ");
        }

        new SelectionObj().sort(randomized);

        System.out.println();
        System.out.println("Circles After:");
        for (int i = 0; i < randomized.length; i++) {
            System.out.print(randomized[i]+", ");
        }
    }
}