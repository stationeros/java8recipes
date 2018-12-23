package com.rohitk.java8;

import java.util.Arrays;
import java.util.List;


/**
 * Class that shows three ways of getting sum from a list of Integers.
 * 1. Total of all the values.
 * 2. Total of all even numbers.
 * 3. Total of all odd numbers.
 * We see that for all the abpve three logic, we duplicate a lot of code
 * thereby violating the DRY principle.
 */
public class SumStrategyJava7 {

    /**
     * Driver class for SumStrategyJava7
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(totalEvenValues(list));
        System.out.println(totalOddValues(list));
        System.out.println(total(list));
    }

    /**
     * Method to calculate the sum of even values.
     * @param list
     * @return sum of even values.
     */
    public static int totalEvenValues(List<Integer> list) {
        int sum = 0;
        for (Integer num: list) {
            if (num % 2 == 0)
                sum = sum + num;
        }
        return sum;
    }

    /**
     * Method to calculate the sum fo odd values.
     * @param list
     * @return sum of odd values.
     */
    public static int totalOddValues(List<Integer> list) {
        int sum = 0;
        for (Integer num: list) {
            if (num % 2 != 0)
                sum = sum + num;
        }
        return sum;
    }

    /**
     * Method to calculate the sum of all values.
     * @param list
     * @return sum of all values.
     */
    public static int total(List<Integer> list) {
        int sum = 0;
        for (Integer num: list) {
            sum = sum + num;
        }
        return sum;
    }
}
