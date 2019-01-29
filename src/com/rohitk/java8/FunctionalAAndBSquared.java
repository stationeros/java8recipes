package com.rohitk.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Example of and b whole squared using functions.
 * We are going to compute result and then keep passing it.
 */
public class FunctionalAAndBSquared {

    public static void main(String[] args) {

        Function<Input, Input> aSquare = (input) -> new Input(input.getA(), input.getA(), (input.getA() * input.getA()) + input.getResult());
        Function<Input, Input> bSquare = (input) -> new Input(input.getB(), input.getB(), (input.getB() * input.getB()) + input.getResult());
        Function<Input, Input> twoAB = (input) -> new Input(input.getB(), input.getB(), (2 * input.getA() * input.getB()) + input.getResult());

        Function<Input, Input> formula = aSquare.andThen(bSquare).andThen(twoAB);
        System.out.println(formula.apply(new Input(10,12,0)).getResult());
        System.out.println(formula.apply(new Input(110,82,0)).getResult());
    }
}

class Input {
    private int a;
    private int b;
    private int result;

    public Input(int a , int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResult() {
        return result;
    }
}