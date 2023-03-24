import java.util.Arrays;
import java.util.Random;

// file stuff
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// my stuff
import Interfaces.SortingAlgorithm;
import SortingAlgorithms.*;

public class BenchMark {
   private static final int NUM_ITERATIONS = 10;
   private static final int[] SIZES_TO_TEST = {10, 100, 500, 1000, 10000, 100000};

   public static void main(String[] args) {

       for (int arrSize : SIZES_TO_TEST) {
            System.out.println("Array Size: "+SIZES_TO_TEST);

            int[] baseArr = createRandomArray(arrSize);
            benchmark(baseArr);

        }
   }

    private static int[] createRandomArray(int arrSize) {
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * arrSize);
        }
        return arr;
    }

    private static void benchmark(int[] array) {
        Path directory = Paths.get("SortingAlgorithms");
        try {
            Files.list(directory)
                    .filter(file -> file.toString().endsWith(".java"))
                    .forEach(file -> {
                        String className = file.getFileName().toString().replace(".java", "");
                        try {
                            Class<?> sortingClass = Class.forName(className);
                            Object sortingObj = sortingClass.getDeclaredConstructor().newInstance();
                            long startTime = System.nanoTime();
                            sortingClass.getMethod("sort", int[].class).invoke(sortingObj, array);
                            long endTime = System.nanoTime();
                            long duration = (endTime - startTime);
                            System.out.println(className + ": " + duration + " ns");
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
