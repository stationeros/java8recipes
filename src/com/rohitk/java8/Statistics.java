package com.rohitk.java8;

import java.util.Arrays;
import java.util.List;

/**
 * For a given list.
 * Find max number
 * Find min number
 * Find first even number then double it else return -1
 */
public class Statistics {

    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int min = numbers.stream()
                .reduce((num1, num2) -> num1.compareTo(num2) <= 0 ? num1 :num2)
                .get();
        System.out.println(min);

        int max = numbers.stream()
                .reduce((num1, num2) -> num1.compareTo(num2) <= 0 ? num2 :num1)
                .get();
        System.out.println(max);

        int doubRes = numbers.stream()
                .filter(e -> e%2 ==0)
                .filter(e -> e>3)
                .map(e -> e*2)
                .findFirst()
                .orElse(-1);
        System.out.println(doubRes);
    }
}
