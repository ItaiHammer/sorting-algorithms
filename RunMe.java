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

        ArrayList<Circle> circles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            circles.add(new Circle((int)(Math.random() * 99) + 1))
        }

        ArrayList<int[]> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);

        for( int i = 0; i < tests.size(); i++) {
            int[] test = tests.get(i);
            System.out.println("===== Test #" + i + "=========");
            System.out.println("Before: " + Arrays.toString(test));
            
            

            System.out.println("After: " + Arrays.toString(test));
            System.out.println("================================");
        }
    }
}