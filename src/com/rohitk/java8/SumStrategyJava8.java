package com.rohitk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Compact class using Java8 constructs to get
 * 1. Total of all integer values from a list.
 * 2. Total of all even integers from a list.
 * 3. Total of all odd values from a list.
 */
public class SumStrategyJava8 {

    /**
     * Driver method to pass in the predicate (as lambda) and list
     * to the higher order function total.
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Total of all values: " + total(list, e -> true));
        System.out.println("Total of even values: " + total(list, e -> e%2 ==0));
        System.out.println("Total of odd values: " + total(list, e -> e%2 != 0));
    }

    /**
     * Method total is a higher order function i.e it takes a function as
     * an argument in the form of a predicate and a list.
     * @param list
     * @param predicate
     * @return
     */
    public static int total(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream()
                .filter(predicate)
                .reduce(0, Integer::sum);
    }
}
