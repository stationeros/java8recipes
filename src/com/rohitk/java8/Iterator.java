package com.rohitk.java8;


import java.util.Arrays;
import java.util.List;

public class Iterator {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //External java8. Focus is on how to iterate and print.
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //A bit of improvement.
        for (Integer num: list) {
            System.out.println(num);
        }

        //Internal iterators. Focus on what to do with element and not how to iterate over it.
        list.forEach(e -> System.out.println(e));

        //Method references
        list.forEach(System.out::println);

    }
}
