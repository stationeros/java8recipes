package com.rohitk.java8;

import java.util.Date;

/**
 * Showing multiple ways to declare lambda in Java8.
 */
public class WaysToDeclareLambda {

    public static void main(String[] args) {
        // With types and without body, hence no return statement required.
        Name name = (String firstName, String lastName) -> firstName + " " + lastName;

        //Type inference into picture
        Name nameWithoutType = (firstName, lastName) -> firstName + " " + lastName;

        Name nameWithBody = (firstName, lastName) -> {
            //Return mandatory here, when using body.
            return firstName + " " + lastName;
        };

        IDateTime time = () -> new Date().toString();
    }
}

@FunctionalInterface
interface IDateTime {
    String now();
}

@FunctionalInterface
interface Name {
    String echo(String firstName, String lastName);
}

