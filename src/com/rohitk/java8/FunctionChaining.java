package com.rohitk.java8;

import java.util.function.Function;

/**
 * Example class to show function chaining.
 *
 */
public class FunctionChaining {

    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = e -> e * e;
        Function<Integer, Integer> increment = e -> e + 1;

        //Using the increment function to increment a value.
        System.out.println("Inceremented value: " + increment.apply(5));

        //Using the doubleIt function to double the value.
        System.out.println("Double value: " + doubleIt.apply(5));

        //Using function chaining to increment and double a value.
        System.out.println("Function chaining: " + increment.andThen(doubleIt).apply(5));
    }
}
