import java.util.Arrays;
import java.util.Random;

// file stuff
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

// api
import Interfaces.SortingAlgorithm;
import SortingAlgorithms.*;

public class BenchMark {
   private static final int NUM_ITERATIONS = 10;
   private static final int[] SIZES_TO_TEST = {10, 100, 500, 1000, 10000, 100000};

   public static void main(String[] args) {
       long insertionTotalTime;
       long selectionTotalTime;
       long mergeTotalTime;

       System.out.println("Array size, insertion sort (ns), selection sort (ns), merge sort (ns)");
       for (int arrSize : SIZES_TO_TEST) {
           insertionTotalTime = 0;
           selectionTotalTime = 0;
           mergeTotalTime = 0;

           for (int i = 0; i < NUM_ITERATIONS; i++) {
               long startTime = 0, endTime = 0;

               int[] baseArr = createRandomArray(arrSize);

               // --------- insertion sort for loop ---------
               int[] arrCopy = Arrays.copyOf(baseArr, baseArr.length);
               startTime = System.currentTimeMillis();
               InsertionSortWhileLoop s = new InsertionSortWhileLoop();
               s.sort(arrCopy);
               endTime = System.currentTimeMillis();
               insertionTotalTime += (endTime - startTime);
               // ----------------------------------

               // --------- selection sort ---------
               arrCopy = Arrays.copyOf(baseArr, baseArr.length);
               startTime = System.currentTimeMillis();
               SelectionSort s2 = new SelectionSort();
               s2.sort(arrCopy);
               endTime = System.currentTimeMillis();
               selectionTotalTime += (endTime - startTime);
               // ----------------------------------

               // --------- merge sort ---------
               arrCopy = Arrays.copyOf(baseArr, baseArr.length);
               startTime = System.currentTimeMillis();
               MergeSort s3 = new MergeSort();
               s3.sort(arrCopy);
               endTime = System.currentTimeMillis();
               mergeTotalTime += (endTime - startTime);
               // ----------------------------------
           }

           System.out.println(arrSize + ", " + (double)insertionTotalTime/NUM_ITERATIONS + ", " + (double)selectionTotalTime/NUM_ITERATIONS + ", " + (double)mergeTotalTime/NUM_ITERATIONS);
       }
   }

    private static int[] createRandomArray(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * arrSize);
        }
        return arr;
    }

    // public static void BenchmarkSorting (int[] baseArr) throws IllegalArgumentException, InvocationTargetException {
    //     String folderPath = "./Sorting Algorithms";
    //     File folder = new File(folderPath);
    //     File[] files = folder.listFiles();

    //     // Loop through all files in the folder
    //     for (File file : files) {
    //         if (file.isFile() && file.getName().endsWith(".class")) {
    //             String className = file.getName().replace(".class", "");

    //             try {
    //                 // Load the class using a URLClassLoader
    //                 URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{folder.toURI().toURL()});
    //                 Class<?> clazz = classLoader.loadClass(className);

    //                 // Instantiate the class and call its main method
    //                 SortingAlgorithm instance = (SortingAlgorithm)(clazz.newInstance());
    //                 instance.sort(baseArr);
    //             } catch (ClassNotFoundException | IOException | IllegalAccessException | InstantiationException | NoSuchMethodException | SecurityException e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     }
    // }
    
}
