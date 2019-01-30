package com.rohitk.java8;

import java.util.function.Predicate;

/**
 * Example of a predictae validation for user
 * Username should not be null
 * username should not be blank
 * username should be greater than 6 characters.
 */
public class ValidateUserByPredicate {

    public static void main(String[] args) {
        Predicate<String> validateUser = (userName) -> userName != null && userName != ""
                && userName.length() > 6;
        System.out.println(validateUser.test("Rohit Kumar"));
        System.out.println(validateUser.test(""));
        System.out.println(validateUser.test(null));
    }
}
