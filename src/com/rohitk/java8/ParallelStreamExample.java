package com.rohitk.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Looking first hand at Parallel Processing in Java8.
 */
public class ParallelStreamExample {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    public static void main(String[] args) {
        // These many threads will be created.
        System.out.println("Number of cores : " + Runtime.getRuntime().availableProcessors());
        calculate();
    }

    private static boolean findEven(int number) {
        System.out.println("Inside findeven method : " + number + " ----> " + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {}
        return number %2 == 0;
    }

    private static void calculate() {
        numbers.stream()
                .parallel()
                .filter(ParallelStreamExample::findEven)
                .forEach(e -> {});
    }

    /**
     * Think about paralleizing this by breaking the list into chunks.
     * We might go crazy doing that.
     */
    private static void caluclateWithoutStreams() {
        for (Integer num : numbers) {
            if (findEven(num)) {
                System.out.println(num);
            }
        }
    }
}
