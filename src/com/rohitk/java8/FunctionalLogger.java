package com.rohitk.java8;

import java.util.function.Supplier;

/**
 * Passing the function body to logger.
 * Here debug is a higher order function.
 */
public class FunctionalLogger {
    private int level = 1;

    public FunctionalLogger() {
    }
    public FunctionalLogger(int level) {
        this.level = level;
    }
    public boolean isDebugEnabled() {
        return level == 1;
    }
    public void debug(Supplier<String> message) {
        if (isDebugEnabled())
            System.out.println(message.get());
    }

    public static void main(String[] args) {
        FunctionalLogger logger = new FunctionalLogger();
        logger.debug(() -> "Look at this horrible error");
        logger.debug(() -> {
            //Write code to send mail
            return "Error occurred sent email to required personnel.";
        });
    }
}