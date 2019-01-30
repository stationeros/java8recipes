package com.rohitk.java8;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "Ruby", "Clojure", "Javascript");

        //Language that begin with J and whose length is greater than 5
        //We will put logs to observe the behaviour.
        // Study of output.
        //        Filter 1 : Java
        //        Filter 2 : Java
        //        Filter 1 : Scala
        //        Filter 1 : Ruby
        //        Filter 1 : Clojure
        //        Filter 1 : Javascript
        //        Filter 2 : Javascript
        //                Javascript
        // ** It takes every element and then passes through the filters,
        // If it fails filter1 then does nto go through filter 2
        // So it does not find the results and then hand over to forEach.
        // It runs each element through everything.
        languages.stream()
                .filter(lang -> {
                    System.out.println("Filter 1 : " + lang);
                    return lang.startsWith("J");
                })
                .filter(lang -> {
                    System.out.println("Filter 2 : " + lang);
                    return lang.length() > 6;
                })
                .forEach(System.out::println);
    }
}
