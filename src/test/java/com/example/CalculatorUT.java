package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorUT {
    @Test
    public void addsTwoNumbers() {
        assertEquals(9, new Calculator().add(3, 4));
    }
}