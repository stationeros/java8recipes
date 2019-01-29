package com.rohitk.java8;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        NumberCheck isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.check(12));

        //Predicate is a pre-defined function interfae that can take anything as input and returns boolean as output.
        //It has one method called test. Filter is a higher order function that takes in predicate as argument.

        Predicate<Integer> predicate = (num) -> num % 2 == 0;
        System.out.println(predicate.test(12));

    }
}

/**
 * This use case is ver common where we check and return a Boolean,
 * so we can;t keep defining a FunctionalInterface everytime. Hence the
 * need for predicate.
 */
@FunctionalInterface
interface NumberCheck {
    Boolean check(Integer number);
}
