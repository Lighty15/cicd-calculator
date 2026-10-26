package com.example;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }

    public void print(int value) {
    	LOGGER.log(Level.INFO, "Result: {0}", value);
    }
}