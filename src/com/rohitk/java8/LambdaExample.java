package com.rohitk.java8;

import java.util.Arrays;

public class LambdaExample {

    static Greeting greet = (name) -> "Hi :" + name;

    public static void main(String[] args) {
        System.out.println(greet.greet("Rohit"));

        //There will be no classs file generated as lambda function is generated at runtime.
        System.out.println(greet.getClass().getName());

        //We can check that the runtime function is of type Object.
        System.out.println(greet.getClass().getSuperclass().getName());

        //Check that runtime function implements Greeting
        for (Class cls : greet.getClass().getInterfaces()) {
            System.out.println(cls.getName());
        }
    }
}

/**
 * Lambdas can be used to implement interfaces
 * with one function.
 */
interface Greeting {

    /**
     *
     * @param name
     * @return String
     */
    public String greet(String name);
}