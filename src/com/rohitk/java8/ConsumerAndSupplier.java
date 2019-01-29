package com.rohitk.java8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Simple class demonstrating a consumer and a supplier.
 */
public class ConsumerAndSupplier {

    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> (int)(Math.random() * 100);
        System.out.println(randomSupplier.get());

        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());

        //Example of consumer if forEach
        Consumer<Integer> printNumber = (num) -> System.out.println(num);
        printNumber.accept(2);

    }
}
